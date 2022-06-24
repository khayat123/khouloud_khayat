package com.example.exercice.Entity;

import lombok.Data;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String adresse;
    private String tel;
}
