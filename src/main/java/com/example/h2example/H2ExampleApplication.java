package com.example.h2example;

import com.example.h2example.db.Employee;
import com.example.h2example.db.repository.EmployeeRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
@RequestMapping(value = "", produces = "application/json")
public class H2ExampleApplication {

    @Autowired
    private EmployeeRep employeeRep;

    public static void main(String[] args) {
        SpringApplication.run(H2ExampleApplication.class, args);
    }

    @RequestMapping("create-employee")
    public Employee createPerson(){
        return employeeRep.save(new Employee());
    }
    @RequestMapping("employees")
    public ArrayList getList() {
        return (ArrayList) employeeRep.findAll();
    }
}
