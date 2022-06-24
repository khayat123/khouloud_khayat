package com.example.exercice.Controller;

import com.example.exercice.Entity.Employe;
import com.example.exercice.Entity.Message;
import com.example.exercice.Service.EmployeService;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RequestMapping("/api/employe")
public class EmployeController {

    private EmployeService employeService;
    public EmployeController(EmployeService employeService) {
        this.employeService = employeService;
    }
    //build create employe REST API
    @PostMapping

    public ResponseEntity<Employe> creeEmploye(@RequestBody Employe employe){
        return new ResponseEntity<Employe>(employeService.creerEmploye(employe), HttpStatus.CREATED);
    }

    //build update employe REST API
    //http://localhost:8181/api/employe/1
    @PutMapping("{id}")
    public ResponseEntity<Employe> updateEmploye(@RequestBody Employe employe,@PathVariable("id") long employeid){
        return new ResponseEntity<Employe>(employeService.updateEmploye(employe,employeid),HttpStatus.OK);

    }




    //build get all produit REST API
    @GetMapping
    public List<Message> getEmployeesMessages(){
        return employeService.getEmployeesMessages();
    }
}
