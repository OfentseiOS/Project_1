package com.javaApp.javaApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaApp.javaApp.models.Employee;
import com.javaApp.javaApp.repo.EmployeeRepo;

import io.micrometer.common.lang.NonNull;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    @PostMapping
    public Employee save(@Validated @NonNull @RequestBody Employee employee) {
        return employeeRepo.save(employee);
    }
    @PutMapping("/{empId}")
    public Employee update(@Validated @NonNull @RequestBody Employee employee) {
        return employeeRepo.save(employee);
    }
}
