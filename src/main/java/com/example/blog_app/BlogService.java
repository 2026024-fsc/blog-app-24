package com.example.blog_app;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository){
        this.blogRepository = blogRepository;
    }

    public Blog Blog(){
        return blogRepository.save();
    }
    
}


// public Optional<Blog> findById(Long id) {
    //     return bookRepository.findById(id);
    // }