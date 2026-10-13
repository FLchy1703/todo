package com.example.todo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/tasks") //mọi đường dẫn trong class này bắt đầu bằng /tasks.
@RestController //báo cho Spring đây là nơi nhận request HTTP, và các method sẽ trả về dữ liệu (JSON) chứ không phải trang HTML.
public class TaskController {
    private final TaskRepository repo;
    public TaskController(TaskRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Task> findAll() {
        return repo.findAll();
    }

    @PostMapping
    public Task save(@RequestBody Task task) {
        return repo.save(task);
    }
}
