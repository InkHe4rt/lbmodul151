package projekt.modul_151.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import projekt.modul_151.model.Person;
import projekt.modul_151.model.Place;
import projekt.modul_151.service.PersonService;
import projekt.modul_151.service.PlaceService;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private PlaceService placeService;

    // wenn ich den knopf drücke wird der nutzer erstellt
    @PostMapping("/profile")
    public String add(@ModelAttribute @Valid Person person, Model model){
        Place place = placeService.getPlace(person.getAddress().getPlace().getCity());
        if ( place != null && place.getCity() != null){
            person.getAddress().setPlace(place);
        }
        personService.addPerson(person);
        model.addAttribute(person);
        return "profile";
    }

    @GetMapping(value = {"", "/{id}"})
    public String showForm(@PathVariable("id") Optional<Long> id, Model model){
        Person person;
        if(id.isPresent())
            person = personService.getPerson(id.get());
        else
            person = new Person();

        model.addAttribute("saved", false);
        model.addAttribute("person", person);
        return "personForm";
    }



}
