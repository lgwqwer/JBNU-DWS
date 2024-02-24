package GBSB.JBNU_DWS.controller;

import GBSB.JBNU_DWS.dto.ConversionForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConversionController {

    @PostMapping("/home")
    public String conversion(Model model, ConversionForm form) {
        model.addAttribute("grade", form.getGrade());
        model.addAttribute("bonusPoint", form.getBonusPoint());
        model.addAttribute("minusPoint", form.getMinusPoint());
        model.addAttribute("distanceScore", form.getDistanceScore());
        model.addAttribute("conversionScore", form.getConversionScore());
        System.out.println(form.toString());
        return "index";
    }
}
