package com.anweb.Finance.loan.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anweb.Finance.loan.model.RoleAssign;
import com.anweb.Finance.loan.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService  adminService;
	
	@GetMapping(value = "/getAllRoleNames")
	public ResponseEntity<List<String>> getAllRoleNames(){
		
		System.err.println("fetching all rolename data !!!");
		
		List<String> list = adminService.getAllRoleNames();
		
		return new ResponseEntity<List<String>>(list , HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/getAllUsernames")
	public ResponseEntity<List<String>> getAllUsernames(){
		
		System.err.println("fetching all Username data !!!");
		
		List<String> list = adminService.getAllUsernames();
		
		return new ResponseEntity<List<String>>(list , HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/assignRole")                        // new model class made for assigning role
	public ResponseEntity<String> assignRoleToUser(@RequestBody RoleAssign roleAssign){
		
		System.out.println("role asssign to user " + roleAssign);
		
		adminService.assignRoleToUser(roleAssign.getUsername(), roleAssign.getRolename());
		
		return new ResponseEntity<String>("role assigned",HttpStatus.OK);
	}
	
	//to get current user which had logged in
	@GetMapping(value = "/current-user")
	public String getLoggedInUser(Principal principal) { // principle interface used to give info of which user logged in 
		return principal.getName();
	}
	

}
