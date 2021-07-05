package com.example.h2example.db;

import com.example.h2example.db.repository.EmployeeRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @RequestMapping - annotation for mapping requests to controllers methods
 * @RequestBody указывает, что параметр метода должен быть привязан к значению тела HTTP-запроса
 * */

@RestController
public class EmployeeController {
    @Autowired // отмечает конструктор, поле или метод как требующий автозаполнения инъекцией зависимости Spring
    private EmployeeRep employeeRep;

    @PostMapping("create-employee") // post - создание ресурса
    public void createEmployee(@RequestBody String name, Long id){
        Employee employee = new Employee();
        employee.setName(name);
//        employee.setId(id);
         employeeRep.save(employee);
    }

    @GetMapping("employees") // get - получение ресурса
    public List listOfEmployees() {
        return (List) employeeRep.findAll();
    }

}
