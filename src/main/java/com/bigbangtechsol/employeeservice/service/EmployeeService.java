package com.bigbangtechsol.employeeservice.service;

import com.bigbangtechsol.employeeservice.dao.EmployeeCRUDRepo;
import com.bigbangtechsol.employeeservice.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeCRUDRepo employeeCRUDRepo;

    public Employee saveEmployee(Employee employee){
        return employeeCRUDRepo.save(employee);
    }
    public Employee findEmployeeById(Long employeeId){
        return employeeCRUDRepo.findById(employeeId).get();
    }
    public List<Employee> findAll(){
        return employeeCRUDRepo.findAll();
    }
}
