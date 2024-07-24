package com.exemplo.gerenciador.tarefas.service;

import com.exemplo.gerenciador.tarefas.model.Task;
import com.exemplo.gerenciador.tarefas.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> findByUserId(Long userId) {
        return taskREpository.findByUserId(userId);
    }

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public void delete(Long id) {
        taslRepository.deleteById(id);
    }
    

}
