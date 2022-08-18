package com.bigbangtechsol.employeeservice.dao;

import com.bigbangtechsol.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeCRUDRepo extends JpaRepository<Employee,Long> {
}
