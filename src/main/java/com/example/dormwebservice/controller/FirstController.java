package com.example.dormwebservice.controller;

import com.example.dormwebservice.dto.ConversionForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FirstController {

    @GetMapping("/home")
    public String index(Model model) {
        model.addAttribute("distanceScore", "0");
        model.addAttribute("conversionScore", "0");
        return "layouts/index";
    }

    @GetMapping("/conversion")
    public String conversion(ConversionForm form) {

        System.out.println(form.toString());
        return "";
    }
}
