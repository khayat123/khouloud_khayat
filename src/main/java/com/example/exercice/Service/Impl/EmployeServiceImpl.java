package com.example.exercice.Service.Impl;

import com.example.exercice.Entity.Employe;
import com.example.exercice.Entity.Message;
import com.example.exercice.Repository.EmployeRepository;
import com.example.exercice.Service.EmployeService;
import org.springframework.stereotype.Service;
import com.example.exercice.exception.RessourceNotFoundException;

import java.util.List;

@Service
public class EmployeServiceImpl implements EmployeService {

    private EmployeRepository employeRepository;

    public EmployeServiceImpl(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    @Override
    public Employe creerEmploye(Employe employe) {

        return employeRepository.save(employe);
    }

    @Override
    public Employe updateEmploye(Employe employe,long id) {
        //checking if the employe exist in DB or not
        Employe existingEmploye = employeRepository.findById(id).orElseThrow(() -> new RessourceNotFoundException("Employe","id",id));

        existingEmploye.setname(employe.getname());
        existingEmploye.setadresse(employe.getadresse());
        existingEmploye.setemail(employe.getemail());
        existingEmploye.settel(employe.gettel());
        //saving
        employeRepository.save(existingEmploye);
        return existingEmploye;
    }

    @Override
    public List<Message> getEmployeesMessages() {
        return employeRepository.findAll();

    }
}
