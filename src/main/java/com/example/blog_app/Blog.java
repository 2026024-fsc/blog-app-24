package com.example.blog_app;

import java.time.LocalDateTime;

// import org.springframework.scheduling.config.Task;

public class Blog {
    String title;
    LocalDateTime data;
    long id;
    String main_text;

    public Blog(String title, LocalDateTime data, long id, String main_text){
        this.title = title;
        this.data = data;
        this.id = id;
        this.main_text = main_text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMain_text() {
        return main_text;
    }

    public void setMain_text(String main_text) {
        this.main_text = main_text;
    }
}

