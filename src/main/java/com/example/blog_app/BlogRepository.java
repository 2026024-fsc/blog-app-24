package com.example.blog_app;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;


@Repository
public class BlogRepository {
    private final JdbcClient jdbcClient;

    public BlogRepository(JdbcClient jdbcclient){
        this.jdbcClient = jdbcclient;
    }

    public List<Blog> findAll(){
        return jdbcClient.sql("SELECT title, data, id, main_text FROM blog")
        .query(Blog.class)
        .list();
    }
    
    public Optional<Blog> findById(Long id){
        return jdbcClient.sql("SELECT title, data, id, main_text FROM blog WHERE id = :id")
        .param("id", id)
        .query(Blog.class)
        .optional();
    }
}
