package example.spring.demo.controller;

import example.spring.demo.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ArticleController {

    @GetMapping("/new")
    public String newArticleForm(){
        return "articles/new";
    }


    @PostMapping("/result")
    @ResponseBody
    public String handleFormSubmission(ArticleForm form){
        String grade = form.getGrade();
        String distScore = form.getDistScore();

        double result = (Double.parseDouble(grade)/4.5f)*90 + Double.parseDouble(distScore);

        System.out.println("Received Grade: " + grade);
        System.out.println("Received Distance Score: " + distScore);

        System.out.println("Result: " + result);
        return "";
    }
}
