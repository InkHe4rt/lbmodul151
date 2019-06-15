package projekt.modul_151.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import projekt.modul_151.model.Ordering;
import projekt.modul_151.model.Person;
import projekt.modul_151.service.PersonService;

import javax.validation.Valid;

/**
 * Dies ist der Controller für den shop und registration.
 *
 *
 * @author  Dubler Michel
 * @version 1.0
 * @since   2019-06-15
 *
 */
@Controller
@RequestMapping
public class AppController {
    @Autowired
    private PersonService personService;

    /**
     * Hier mit wird die html shop seite aufgerufen.
     *
     * @param model
     * @return
     */
    @GetMapping("/shop")
    public String showShop(Model model){
        return "shop";
    }

    /**
     * Hier vergleiche ich das password mit der in der datenbank und das selbe mit der E-mail.
     * Sofern beide stimmen wird man auf die html seite shopAtrikle weitergeleitet.
     * wenn es einen fehler hat wird meine fail html seite aufgerufen.
     *
     *
     * @param model
     * @param email
     * @param password
     * @return
     */
    @PostMapping("/login/shop")
    public String loginShop(Model model, @Valid String email, @Valid String password){

        String pw = personService.getPerson(email).getPassword();
        if (pw.equals(password)){
            Ordering ordering = new Ordering();
            model.addAttribute(ordering);
            return "shopArtikle";
        }
        return "failed";
    }

    /**
     * Das Formular für die Regestration wird hier aufgerufen.
     *
     * @param model
     * @return
     */
    @GetMapping("/registration")
    public String showRegistration(Model model){
        model.addAttribute(new Person());
        return "registration";
    }

}
