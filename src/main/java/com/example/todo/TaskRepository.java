package com.example.todo;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long>  {//cho biết kiểu dữ liệu của khoá chính

}
