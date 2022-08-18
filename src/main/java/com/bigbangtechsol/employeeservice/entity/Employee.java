package com.bigbangtechsol.employeeservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long empId;
    String name;
    String lastName;
    @JsonFormat(pattern="yyyy-MM-dd")
    Date joiningDate;
    String officeLocation;
    @OneToOne(fetch = FetchType.EAGER,targetEntity = Address.class,cascade=CascadeType.ALL)
    @JoinColumn(name = "addressId")
    Address address;
    long salary;

}
