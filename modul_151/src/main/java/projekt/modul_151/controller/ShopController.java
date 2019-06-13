package projekt.modul_151.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/showContent")
public class ShopController {

    @GetMapping
    public String showAnmelden(Model model){
        return "shopArtikle";
    }


}