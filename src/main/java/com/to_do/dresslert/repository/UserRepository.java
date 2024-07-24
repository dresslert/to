package com.exemplo.gerenciador.tarefas.repository;

import com.exemplo.gerenciador.tarefas.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}