package com.sit.hrpmis.service;

import com.sit.hrpmis.dto.employee.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> getEmployeeList();
    EmployeeDto getEmployeeNo(Long employeeNo);
}
