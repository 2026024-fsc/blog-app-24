package com.example.blog_app;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository){
        this.blogRepository = blogRepository;
    }

    public List<Blog> findAll(){
        return blogRepository.findAll();
    }

    public void save(BlogForm blogForm){
        blogRepository.save(new Blog(blogForm.getId(),blogForm.getTitle(), blogForm.getCreated_at(), blogForm.getMain_text()));
    }

    public Blog find(Long id){
        return blogRepository.find(id);
    }
    
}


// public Optional<Blog> findById(Long id) {
    //     return bookRepository.findById(id);
    // }