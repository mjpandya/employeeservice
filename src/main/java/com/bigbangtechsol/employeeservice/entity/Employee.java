package com.bigbangtechsol.employeeservice.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Employee {
    @Id
    int empId;
    String name;
    String lastName;
    Date joiningDate;
    String officeLocation;
    @OneToOne(fetch = FetchType.LAZY,mappedBy = "address")
    Address address;
    long salary;

}
