package projekt.modul_151.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import projekt.modul_151.model.Ordering;
import projekt.modul_151.service.OrderService;

import javax.servlet.http.HttpSession;

/**
 * Dies ist der Controller für die Bestellung.
 *
 *
 * @author  Dubler Michel
 * @version 1.0
 * @since   2019-06-15
 *
 */
@Controller
@RequestMapping("/order")
public class OrderedController {

    @Autowired
    private OrderService orderService;

    /**
     * Diese Methode ruft das login inerhalb der bestellung auf.
     *
     * @param model
     * @return
     */
    @GetMapping
    public String showAnmelden(Model model){
        return "login";
    }

    /**
     * Ich habe hier mit loginshop versucht die attribute von der bestellung weiter zu geben.
     *
     * Session habe ich später hier ergänzt
     * 
     * @param model
     * @param ordering
     * @param session
     * @return
     */
    @PostMapping
    public String loginShop(Model model, Ordering ordering, HttpSession session){

        session.removeAttribute("active");
        model.addAttribute(ordering);

        return "order";
    }

}




