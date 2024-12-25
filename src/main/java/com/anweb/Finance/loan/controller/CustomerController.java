package com.anweb.Finance.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.anweb.Finance.loan.dto.CustomerDTO;
import com.anweb.Finance.loan.entity.Customer;
import com.anweb.Finance.loan.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerservice;
	
	@PostMapping(value = "/addCustomer")
	public ResponseEntity<String> addCustomerDetails(@RequestBody Customer customer){
		
		System.out.println("check customer data : "+ customer);
		
		customerservice.addCustomerDetails(customer);
	
		return new ResponseEntity<String>("Customer details added successfully", HttpStatus.OK);
		
	}
	
	//get customer 
	
	@GetMapping(value ="/getCustomerData/{customeruniqueno}")
	public ResponseEntity<CustomerDTO> getCustomerDataUsingCustomeruniqueno(@PathVariable String customeruniqueno){
		
		System.out.println("check unique number :"+customeruniqueno);
		
		CustomerDTO customerDTO =customerservice.getCustomerDataUsingCustomeruniqueno(customeruniqueno);
		//but my customer may come null also so add exception handling using optional class inn service implements
		
		return new ResponseEntity<CustomerDTO>(customerDTO,HttpStatus.OK);
	}
	
	@PutMapping(value = "/updateCustomer")
	public ResponseEntity<String> updateCustomerDetails(@RequestBody Customer customer){
		
		System.out.println("check customer data : "+ customer);
		
		customerservice.updateCustomerDetails(customer);
		
		return new ResponseEntity<String>("Customer details updated successfully", HttpStatus.OK);
		
	}
	
	@PutMapping("/resetPassword/{emailid}/{newpassword}")
	public ResponseEntity<String> ResetPassword(@PathVariable String emailid ,@PathVariable String newpassword) {
		
		System.out.println("check email id :"+ emailid);
		
		customerservice.forgetPassword(emailid, newpassword);
		
		return new ResponseEntity<String>("Customer password updated successfully", HttpStatus.OK);
		
	}
	
	@PutMapping("/updatePassword")
	public ResponseEntity<String> ResetPassword(@RequestParam String emailid ,@RequestParam String oldpassword, @RequestParam String newpassword) {
		
		System.out.println("check email id :"+ emailid);
		
		customerservice.ResetPassword(emailid, oldpassword, newpassword);
		
		return new ResponseEntity<String>("Customer password updated successfully", HttpStatus.OK);
		
	}

}
