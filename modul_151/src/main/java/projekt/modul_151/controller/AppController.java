package projekt.modul_151.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import projekt.modul_151.model.Person;
import projekt.modul_151.service.PersonService;

import javax.validation.Valid;


@Controller
@RequestMapping
public class AppController {
    @Autowired
    private PersonService personService;

    @GetMapping("/shop")
    public String showShop(Model model){
        return "shop";
    }

    @PostMapping("/login/shop")
    public String loginShop(Model model, @Valid String email, @Valid String password){

        String pw = personService.getPerson(email).getPassword();
        if (pw.equals(password)){
            return "shop";
        }
        return "failed";
    }
// formular wird aufgerufen mit /registration
    @GetMapping("/registration")
    public String showRegistration(Model model){
        model.addAttribute(new Person());
        return "registration";
    }
}
