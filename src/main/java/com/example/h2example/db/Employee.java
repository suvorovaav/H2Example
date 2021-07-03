package com.example.h2example.db;

import javax.persistence.*;

@Entity // класс - JPA сущность
@Table(name = "EMPLOYEES")
public class Employee {
    @javax.persistence.Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(name = "personName")
    private String name;

    public Employee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
