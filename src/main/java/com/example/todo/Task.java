package com.example.todo;
import jakarta.persistence.*;

@Entity //Khai báo cho JPA class này = 1 bảng trong database
public class Task {
    @Id //Đánh dấu Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Increments
    private Long id;
    private String title;
    private boolean done;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Long getId() {
        return id;
    }

    public Task() { //Khởi tạo Constructor

    }
}

