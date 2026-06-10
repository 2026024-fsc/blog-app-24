package com.example.blog_app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class BlogController {

    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/main")
    public String main(Model model) {
        model.addAttribute("blog", blogService.findAll());
        blogService.findAll();
        return "main";
    }

    @PostMapping("/main")
    public String Post(BlogForm blogForm) {
        blogService.save(blogForm);
        return "redirect:/main";
    }

    @GetMapping("/post")
    public String Post() {
        return "post";
    }

    @GetMapping("/main/{id}/find")
    public String find(@PathVariable long id, Model model) {
        Blog blog = blogService.find(id);
        model.addAttribute("solo", blog);
        return "blogs";
    }
    
    
}