package com.example.blog_app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class BlogController {

    private final BlogRepository blogRepository;

    public BlogController(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @GetMapping("/main")
    public String main() {// Model model) {
        // model.addAttribute("title", "今日の天気");
        blogRepository.findAll();
        return "main";
    }

    @PostMapping("/main")
    public String Post(@ModelAttribute BlogForm form, Model model) {
        model.addAttribute("id",form.getId());
        model.addAttribute("title", form.getTitle());
        model.addAttribute("created_at", form.getCreated_at());
        model.addAttribute("main_text", form.getMain_text());
        //TODO: process POST request
        
        return "redirect:main";
    }
}