package com.bigbangtechsol.employeeservice.entity;

import lombok.*;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long addressId;
    String flatNo;
    String area;
    int pinCode;
    String landMark;
    String city;
    String state;

}
