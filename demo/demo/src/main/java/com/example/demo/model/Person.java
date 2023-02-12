package com.example.demo.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name = "persons")

public class Person {
  @Id

  @GeneratedValue (strategy = GenerationType.AUTO)

  private int id;
  @Column (nullable = false, length = 30)
  private String name;
  @Column (nullable = false)
  private LocalDate dataDeNascimento;

}
