package com.example.exercice.Repository;

import com.example.exercice.Entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Long>{
}
