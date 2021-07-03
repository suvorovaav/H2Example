package com.example.h2example.db.repository;

import com.example.h2example.db.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRep extends CrudRepository<Employee, Long> {

}
