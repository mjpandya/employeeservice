package com.bigbangtechsol.employeeservice.entity;

import lombok.*;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class Address {
    @Id
    int addressId;
    String flatNo;
    String area;
    int pinCode;
    String landMark;
    String city;
    String state;

}
