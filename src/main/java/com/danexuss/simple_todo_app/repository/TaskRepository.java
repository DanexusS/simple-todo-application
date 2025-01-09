package com.danexuss.simple_todo_app.repository;

import com.danexuss.simple_todo_app.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> { }
