package com.example.h2example.db;

import javax.persistence.*;
import java.util.UUID;

import static java.lang.String.format;

@Entity // класс - JPA сущность => обрабатываем поля как столбцы таблицы
@Table(name = "EMPLOYEES")
public class Employee {
    @javax.persistence.Id
    @GeneratedValue(strategy=GenerationType.AUTO) // как сгенерировать автоматически?
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(name = "employeeName")
    private String name;

    public Employee(){
        String uid = UUID.randomUUID().toString();
        this.name = format("Name_%s", uid);
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
