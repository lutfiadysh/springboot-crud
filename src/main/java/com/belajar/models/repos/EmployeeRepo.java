package com.belajar.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.belajar.models.entities.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
    List<Employee> findByName(String position);
}
