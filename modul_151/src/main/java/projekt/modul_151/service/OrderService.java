package projekt.modul_151.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projekt.modul_151.model.Ordering;
import projekt.modul_151.repository.OrderRepository;

import javax.validation.Valid;
import java.util.Optional;

/**
 * Dies ist der Service für die order.
 *
 *
 * @author  Dubler Michel
 * @version 1.0
 * @since   2019-06-15
 *
 */
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Long addorder(@Valid Ordering order){

        return orderRepository.saveAndFlush(order).getId();
    }

    public Ordering getOrder(Long id){
        Ordering order = new Ordering();
        if(id != null){
            Optional<Ordering> optionalorder = orderRepository.findById(id);
            if(optionalorder.isPresent())
                order = optionalorder.get();
        }
        return order;
    }

    public Ordering getOrder(String comment){
        Ordering order = new Ordering();
        if(order != null){
            Optional<Ordering> optionalorder = orderRepository.findByComment(comment);
            if(optionalorder.isPresent())
                order = optionalorder.get();
        }
        return order;
    }
}
