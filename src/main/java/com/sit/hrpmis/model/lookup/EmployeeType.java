package com.sit.hrpmis.model.lookup;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "gen_employee_types")
public class EmployeeType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMPLOYEE_TYPE_NO", nullable = false, unique = true)
    private Long employeeTypeNo;


    @Column(name = "EMPLOYEE_TYPE")
    private String employeeType;
}
