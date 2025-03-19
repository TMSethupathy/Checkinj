package com.controller.Control.conroller;

import com.controller.Control.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {

    ArrayList<Employee> employees = new ArrayList<>();

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee ){
         employees.add(employee);
         return  employee;
    }

    @GetMapping("/all")
    public List<Employee> getAll(){
        return employees;
    }

}
