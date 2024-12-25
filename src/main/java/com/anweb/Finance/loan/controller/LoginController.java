package com.anweb.Finance.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anweb.Finance.loan.dto.CustomerDTO;
import com.anweb.Finance.loan.model.LoginRequest;
import com.anweb.Finance.loan.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping(value = "/loginCustomer")
	public ResponseEntity<CustomerDTO> LoginDetails(@RequestBody LoginRequest loginRequest){
		
		System.out.println("check your login details "+ loginRequest);
		
		CustomerDTO customerDTO=loginService.getLoginData(loginRequest.getUsername(), loginRequest.getPassword());
		
		return new ResponseEntity<CustomerDTO>(customerDTO , HttpStatus.OK);
	}

}
 