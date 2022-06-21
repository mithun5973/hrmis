package com.sit.hrpmis.service;

import com.sit.hrpmis.dto.employee.EmployeeDto;
import com.sit.hrpmis.dto.response.CommonResponse;
import com.sit.hrpmis.model.employee.Employee;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> getEmployeeList();
    List<Employee> getEmployees();
    EmployeeDto getEmployeeNo(Long employeeNo);

    CommonResponse saveEmployee(Employee  employee );
}
