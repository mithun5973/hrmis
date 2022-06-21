package com.sit.hrpmis.repository.employee;

import com.sit.hrpmis.dto.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

}
