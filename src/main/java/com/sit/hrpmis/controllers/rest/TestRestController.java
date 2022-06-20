package com.sit.hrpmis.controllers.rest;


import com.sit.hrpmis.dto.response.CommonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.URISyntaxException;

@RestController
@RequestMapping(value = "/hrmis/rest-api")
public class TestRestController {

    @RequestMapping(value = "test-get", method = RequestMethod.GET)
    public ResponseEntity<CommonResponse> authenticateUser(  ) {

      return new ResponseEntity(new CommonResponse(), HttpStatus.OK);

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
