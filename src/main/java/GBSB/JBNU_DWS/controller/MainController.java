package GBSB.JBNU_DWS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainController {
    @GetMapping("/home")
    public String home(Model model) {

        // 처음 home 화면의 초기 데이터 0으로 초기화
        model.addAttribute("grade", "0");
        model.addAttribute("bonusPoint", "0");
        model.addAttribute("minusPoint", "0");
        model.addAttribute("distanceScore", "0");
        model.addAttribute("conversionScore", "0");
        return "index";
    }
}
