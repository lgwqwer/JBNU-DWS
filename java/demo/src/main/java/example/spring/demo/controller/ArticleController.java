package example.spring.demo.controller;

import example.spring.demo.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @GetMapping("/new")
    public String newArticleForm(){
        return "articles/new";
    }


    @PostMapping("/result")
    @ResponseBody
    public String handleFormSubmission(ArticleForm form){
        double grade = form.getGrade();
        int bonusPoint = form.getBonusPoint();
        int minusPoint = form.getMinusPoint();
        double distanceScore = form.getDistScore();

        double conversionScore = ((grade + (bonusPoint * 0.009 - minusPoint * 0.009)) / 4.5) * 90 + distanceScore;


        System.out.println("Received Grade: " + grade);
        System.out.println("Received Bonus Point: " + bonusPoint);
        System.out.println("Received Minus Point: "+ minusPoint);
        System.out.println("Received Distance Score: " + distanceScore);

        System.out.println("Result: " + conversionScore);
        return "";
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
