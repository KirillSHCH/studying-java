package Kirill.Localhost.StudyingJava.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/blogs")
    public String blogMain(Model model) {
        model.addAttribute("title", "Блог сайта");
        return "blog-main";
    }
}
