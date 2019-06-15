package projekt.modul_151.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import projekt.modul_151.service.OrderService;

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

    @GetMapping
    public String showAnmelden(Model model){
        return "login";
    }

    @PostMapping
    public String loginShop(Model model){
        //hier frage ich ab ob es keine leere bestellung ist.

        return "failed";
    }

}




