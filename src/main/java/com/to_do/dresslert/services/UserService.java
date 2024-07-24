package com.exemplo.gerenciador.tarefas.service;

import com.exemplo.gerenciador.tarefas.model.User;
import com.exemplo.gerenciador.tarefas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@service
public class UserService {
    @Autowired
    private UserRepository userREpository;

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User save(User user) {
        return userRepository.save(user);
    }
    
}