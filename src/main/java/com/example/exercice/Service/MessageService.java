package com.example.exercice.Service;

import com.example.exercice.Entity.Employe;
import com.example.exercice.Entity.Message;

public interface MessageService {
    Message creerMessage(Message message);
    Message updateMessage(Message message,long id);
}
