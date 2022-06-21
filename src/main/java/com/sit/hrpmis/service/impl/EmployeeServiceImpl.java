package com.sit.hrpmis.service.impl;

import com.sit.hrpmis.dto.employee.EmployeeDto;
import com.sit.hrpmis.dto.response.CommonResponse;
import com.sit.hrpmis.model.employee.Employee;
import com.sit.hrpmis.repository.employee.EmployeeRepository;
import com.sit.hrpmis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl  implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeDto> getEmployeeList() {
        return ConvertToList(employeeRepository.findAll());
    }
    @Override
    public List<Employee > getEmployees() {
        return  employeeRepository.findAll();
    }

    private List<EmployeeDto> ConvertToList(List<Employee> employees) {
        List<EmployeeDto> employeeDtos=new ArrayList<>();
        EmployeeDto employeeDto;
        for (Employee employee:employees
             ) {
            employeeDto=new EmployeeDto();
            employeeDto.setEmployeeNo(employee.getEmployeeNo());
            employeeDto.setEmployeeId(employee.getEmployeeId());
            employeeDto.setDisplayName(employee.getDisplayName());
            employeeDto.setFirstName(employee.getFirstName());


            employeeDtos.add(employeeDto);
        }
        return  employeeDtos;
    }

    @Override
    public EmployeeDto getEmployeeNo(Long employeeNo) {
        return null;
    }

    @Override
    public CommonResponse saveEmployee(Employee  employee ) {
        CommonResponse commonResponse =new CommonResponse();

        employeeRepository.save(employee);
        commonResponse.setResponseMsg("Saved successfully");
        return commonResponse;
    }

    private Employee convertDtoToModel(EmployeeDto employeeDto) {

        return  null;
    }
}
