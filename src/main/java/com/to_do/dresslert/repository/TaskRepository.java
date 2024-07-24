package com.exemplo.gerenciador.tarefas.repository;

import com.exemplo.gerenciador.tarefas.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUserId(Long userId);
}