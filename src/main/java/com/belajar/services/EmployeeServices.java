package com.belajar.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belajar.models.entities.Employee;
import com.belajar.models.repos.EmployeeRepo;

@Service
@Transactional 
public class EmployeeServices {
    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee create(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee detil(Long id){
        return employeeRepo.findById(id).get();
    }

    public Iterable<Employee> getAll(){
        return employeeRepo.findAll();
    }

    public void removeOne(Long id){
        employeeRepo.deleteById(id);
    }

    public List<Employee> findByName(String name){
        return employeeRepo.findByName(name);
    }
}
