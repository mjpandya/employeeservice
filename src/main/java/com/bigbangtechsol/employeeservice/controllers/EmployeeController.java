package com.bigbangtechsol.employeeservice.controllers;

import com.bigbangtechsol.employeeservice.entity.Address;
import com.bigbangtechsol.employeeservice.entity.Employee;
import com.bigbangtechsol.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<?> getAllUsers(){
            List<Employee> employeeList = employeeService.findAll();
            if(employeeList.size() == 0){
                return new ResponseEntity<>("No Employees Found!!!",HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(employeeList,HttpStatus.OK);
    }
    @GetMapping("employees/{empId}")
    public ResponseEntity<?> getEmployee(@PathVariable("empId") Long empId){
        Employee employeeOptional = employeeService.findEmployeeById(empId);

            return new ResponseEntity<>(employeeOptional,HttpStatus.CREATED);

    }
    @PostMapping("/employees/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        Employee employee1 = employeeService.saveEmployee(employee);
        return new ResponseEntity<>(employee1, HttpStatus.CREATED);
    }
}
