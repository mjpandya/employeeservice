package com.bigbangtechsol.employeeservice.controllers;

import com.bigbangtechsol.employeeservice.entity.Address;
import com.bigbangtechsol.employeeservice.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> getAllUsers(){
            ArrayList<Employee> allEmp = new ArrayList<>();
            Address address = new Address("F-203","Kudasan",382421,"City Pulse Cinema","Gandhinagar","Gujarat");
            allEmp.add(new Employee(124,"Mihir","Pandya",new Date(2021,12,01),"Mumbai",address,12L));
            return allEmp;
    }
    @GetMapping("employees/{empId}")
    public Employee getEmployee(@PathVariable("empId") int empId){
        Address address = new Address("F-203","Kudasan",382421,"City Pulse Cinema","Gandhinagar","Gujarat");
        Employee emp = new Employee(124,"Mihir","Pandya",new Date(2021,12,01),"Mumbai",address,12L);
        return emp;
    }
}
