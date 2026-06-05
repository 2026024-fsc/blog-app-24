package com.example.blog_app;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

// import org.springframework.scheduling.config.Task;

@Getter
@Setter
public class Blog {
    private Long id;
    private String title;
    private LocalDateTime created_at;
    private String main_text;

    // public void setId(Long id) {
    //     this.id = id;
    // }

    // public void setTitle(String title) {
    //     this.title = title;
    // }

    // public void setCreated_at(LocalDateTime created_at) {
    //     this.created_at = created_at;
    // }

    // public void setMain_text(String main_text) {
    //     this.main_text = main_text;
    // }

    // public Long getId() {
    //     return id;
    // }

    // public String getTitle() {
    //     return title;
    // }

    // public LocalDateTime getCreated_at() {
    //     return created_at;
    // }

    // public String getMain_text() {
    //     return main_text;
    // }



}