package projekt.modul_151.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Dies ist der Controller für die Homeseite.
 *
 *
 * @author  Dubler Michel
 * @version 1.0
 * @since   2019-06-15
 *
 */
@Controller
public class HomeController {

//  Mit dieser Methode rufe ich die Homeseite auf.
     @GetMapping("/")
     public String showHome(Model model){
         return "home";
     }

}
