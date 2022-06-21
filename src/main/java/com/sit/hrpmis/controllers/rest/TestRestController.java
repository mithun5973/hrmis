package com.sit.hrpmis.controllers.rest;


import com.sit.hrpmis.dto.employee.EmployeeDto;
import com.sit.hrpmis.dto.response.CommonResponse;
import com.sit.hrpmis.model.employee.Employee;
import com.sit.hrpmis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.net.URISyntaxException;

@RestController
@RequestMapping(value = "/hrmis/rest-api")
public class TestRestController {
   @Autowired
    EmployeeService employeeService;
    @RequestMapping(value = "test-get", method = RequestMethod.GET)
    public ResponseEntity<EmployeeDto> authenticateUser(  ) {

      return new ResponseEntity(employeeService.getEmployeeList(), HttpStatus.OK);

    }
    @RequestMapping(value = "test-get-emp", method = RequestMethod.GET)
    public ResponseEntity<Employee> getEMployeeList(  ) {

      return new ResponseEntity(employeeService.getEmployees(), HttpStatus.OK);

    }

    @RequestMapping(value = "test-save", method = RequestMethod.POST)
    public ResponseEntity<CommonResponse> SaveEMployee(   @RequestBody  Employee  employee
    ) {

        return new ResponseEntity(employeeService.saveEmployee(employee ), HttpStatus.OK);

    }


//    @RequestMapping(value = PATH_ALL_JBC_OFFICE_API, method = RequestMethod.GET)
//    public ResponseEntity<OfficeListAPIResponse> getAllJBCOfficeList (HttpServletRequest request,
//                                                                      @RequestHeader(name = "Api-Version",required = true) String apiVersion,
//                                                                      @RequestHeader(  name = "Authorization", required = true) String secureToken
//    ) throws URISyntaxException {
//
//        User user = authFacade.isValidSecureToken(secureToken);
//        if (user == null)
//            return new ResponseEntity(restApiEngingService.getOfficeAPIInvalidResponse(Message.NOT_AUTHORIZED_CODE, Message.NOT_AUTHORIZED_MSG, "Invalid JWT token, seems token is expired/tempered, please use the valid token.!"), HttpStatus.OK);
//
//
//        return   new ResponseEntity(restApiEngingService.getAllJBCOffice(this.getOfficeCdByUserName(user.getUsername()),apiVersion,secureToken), HttpStatus.OK);
//    }


}
