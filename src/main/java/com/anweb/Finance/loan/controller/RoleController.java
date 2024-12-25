package com.anweb.Finance.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anweb.Finance.loan.entity.LoanType;
import com.anweb.Finance.loan.entity.Role;
import com.anweb.Finance.loan.service.RoleService;

@RestController
public class RoleController {

	@Autowired
	private RoleService roleservice;

	@PostMapping(value = "/addroledata")
	public ResponseEntity<String> addingLoantypeData(@RequestBody Role role) { 

		System.out.println("Store Role data : " + role);

		roleservice.addRoleData(role); 

		return new ResponseEntity<String>("Role data added.", HttpStatus.OK);
	}
	
	@GetMapping(value ="/getRollData/{rollname}")                    // use this typecsting when you dont want same name      
	public ResponseEntity<Role> getRollDataUsingRollname(@PathVariable("rollname") String name){
		
		System.out.println("Check whether role present or not :" + name);
		 
		Role role =roleservice.getRollDataByName(name);
		
		return new ResponseEntity<Role>(role , HttpStatus.OK);
	}

	//all role detail, update , only rolename list return
	
	@GetMapping(value ="/getAllRolldata")
	public ResponseEntity<List<Role>> getAllRoleData(){
		
		System.out.println("check all role data");
		
		List<Role> rolelist =roleservice.getAllRoleData();
		
		return new ResponseEntity<List<Role>>(rolelist , HttpStatus.OK);
	}
	
	@PutMapping(value = "/updateRole")
	public ResponseEntity<String> updateRole(@RequestBody Role role){
		
		System.out.println("Updating Role Data");
		roleservice.UpdateRoleByName(role);
		
		return new ResponseEntity<String>("updated sucessfully" , HttpStatus.OK);
	}
	
	@GetMapping(value ="/getAllRoleList")
	public ResponseEntity<List<String>> getRoleNameList() {

		List<String> rolenamelist = roleservice.getRoleNameList();

		return new ResponseEntity<List<String>>(rolenamelist, HttpStatus.OK);
	}
}
