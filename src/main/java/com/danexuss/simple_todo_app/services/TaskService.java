package com.danexuss.simple_todo_app.services;

import com.danexuss.simple_todo_app.models.Task;
import com.danexuss.simple_todo_app.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void createTask(String title) {
        Task task = new Task();

        task.setTitle(title);
        task.setIs_completed(false);

        taskRepository.save(task);
    }

}
