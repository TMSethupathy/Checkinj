package com.controller.Control.conroller;

import com.controller.Control.model.Employee;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class EmployeeController {

    ArrayList<Employee> employees = new ArrayList<>();

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee ){
         employees.add(employee);
         return employee;
    }

    @GetMapping("/all")
    public ArrayList<Employee> getAll(){
        return employees;
    }

    @GetMapping("/{id}")
    public Employee getId(@PathVariable int id) {
        Employee temp = null;
        for (Employee i : employees) {
            if (i.getId() == id) {
                temp = i;
                break;
            }
        }
        return temp;
    }

    @PutMapping("/update/{id}")
    public  Employee update(@PathVariable int id ,@RequestBody  Employee employee){
        Employee update = new Employee();
//        for(Employee i: employees){
//            if(i.getId()==id){
//                update = i;
//                break;
//            }
//        }
        
        update.setId(employee.getId());
        update.setName(employee.getName());
        update.setEmail(employee.getEmail());
        update.setPhone(employee.getPhone());
        employees.set(id-1,update);
        return  update;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmp(@PathVariable int id){
        Employee temp=new Employee();
        for (Employee i :employees) {
            if (i.getId() == id){
                temp = i;
            }
        }
        employees.remove(temp);
        return "Deleted";
    }
}
