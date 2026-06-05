package com.example.blog_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    private final BlogRepository blogRepository;

    public BlogController(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @GetMapping("/main")
    public String blog() {// Model model) {
        // model.addAttribute("title", "今日の天気");
        blogRepository.findAll();
        return "main";
    }

}