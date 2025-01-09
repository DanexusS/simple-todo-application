package com.danexuss.simple_todo_app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private boolean is_completed;

    public Task() { }

    public Task(Long id, String title, boolean is_completed) {
        this.id = id;
        this.title = title;
        this.is_completed = is_completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isIs_completed() {
        return is_completed;
    }

    public void setIs_completed(boolean is_completed) {
        this.is_completed = is_completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", is_completed=" + is_completed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return is_completed == task.is_completed && Objects.equals(id, task.id) && Objects.equals(title, task.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, is_completed);
    }
}
