import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.dto.ArticleForm;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class Controller {

    @GetMapping("/")
    public String newAricleForm() {
        return "index";
    }

    @PostMapping("/form")
    @ResponseBody
    public String createArticle(@ModelAttribute ArticleForm form) {
        System.out.println(form.getGrade());
        System.out.println(form.getDistScore());

        return "result";
    }
}