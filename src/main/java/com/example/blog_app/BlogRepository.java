package com.example.blog_app;

import java.util.List;
import java.util.Optional;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class BlogRepository {
    private final JdbcClient jdbcClient;

    public BlogRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<Blog> findAll() {
        return jdbcClient.sql("SELECT id, title, created_at, main_text FROM blog")
                .query(Blog.class)
                .list();
    }

    public Optional<Blog> findById(Long id) {
        return jdbcClient.sql("SELECT  id, title, data, main_text FROM blog WHERE id = :id")
                .param("id", id)
                .query(Blog.class)
                .optional();
    }

    public void save(Blog blog) {
        jdbcClient.sql("INSERT INTO blog (id, title, created_at, main_text) VALUES (:id, :title, :created_at, :main_text)")
                .param("id", blog.getId())
                .param("title", blog.getTitle())
                .param("created_at", blog.getCreated_at())
                .param("main_text", blog.getMain_text())
                .update();
    }
}
