package projekt.modul_151.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

//  Mit dieser Methode rufe ich die Homeseite auf.
     @GetMapping("/")
     public String showHome(Model model){
         return "home";
     }

}
