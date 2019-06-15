package projekt.modul_151.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Dies ist der Controller für das Login.
 *
 *
 * @author  Dubler Michel
 * @version 1.0
 * @since   2019-06-15
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String showAnmelden(Model model){
        return "login";
    }


}
