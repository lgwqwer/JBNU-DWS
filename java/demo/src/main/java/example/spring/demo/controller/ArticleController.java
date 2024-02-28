package example.spring.demo.controller;

import example.spring.demo.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @GetMapping("/new")
    public String newArticleForm(){
        return "articles/new";
    }


    @PostMapping("/home")
    public String conversion(Model model, ArticleForm form) {

        // DTO 객체의 속성 값을 받아와서 Model에 추가 -> View 조작 가능
        model.addAttribute("grade", form.getGrade());
        model.addAttribute("bonusPoint", form.getBonusPoint());
        model.addAttribute("minusPoint", form.getMinusPoint());
        model.addAttribute("distanceScore", form.getDistanceScore());
        model.addAttribute("conversionScore", form.getConversionScore());
        System.out.println(form.toString());
        return "index";
    }

    //dto get
    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public ModelAndView multiformPage(
            @ModelAttribute("formData") ArticleForm formDto,
            ModelAndView mav) {
        mav.addObject("formData", formDto);
        mav.setViewName("/result");
        return mav;
    }
    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public ModelAndView FormDtoSent(
            @ModelAttribute("formData") ArticleForm formDto,
            ModelAndView mav){
        mav.addObject("formData", formDto);
        mav.setViewName("request");
        return mav;
    }
}
