package GBSB.JBNU_DWS.controller;


import GBSB.JBNU_DWS.dto.ConversionForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("grade", "0");
        model.addAttribute("bonusPoint", "0");
        model.addAttribute("minusPoint", "0");
        model.addAttribute("distanceScore", "0");
        model.addAttribute("conversionScore", "0");
        return "home";
    }


}
