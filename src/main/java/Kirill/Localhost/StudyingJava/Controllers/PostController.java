package Kirill.Localhost.StudyingJava.Controllers;

import Kirill.Localhost.StudyingJava.Entities.PostEntity;
import Kirill.Localhost.StudyingJava.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public String index(Model model) {

        Iterable<PostEntity> posts = postService.findAll();

        model.addAttribute("title", "Posts");
        model.addAttribute("posts", posts);
        return "post-main";
    }
}
