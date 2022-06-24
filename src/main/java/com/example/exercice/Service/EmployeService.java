package com.example.exercice.Service;

import com.example.exercice.Entity.Employe;
import com.example.exercice.Entity.Message;

import java.util.List;

public interface EmployeService {
    Employe creerEmploye(Employe employe);
    Employe updateEmploye(Employe employe,long id);
    List<Message> getEmployeesMessages();
    Message createMessage (Message message);
}
