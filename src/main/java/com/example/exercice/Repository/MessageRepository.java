package com.example.exercice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.exercice.Entity.Message;

public interface MessageRepository extends JpaRepository<Message, Long>{
}
