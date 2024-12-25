package com.anweb.Finance.loan.service;

import java.util.List;

import com.anweb.Finance.loan.entity.Customer;

public interface AdminService {

	List<String> getAllRoleNames();
	
	List<String> getAllUsernames();
	
	void assignRoleToUser(String username, String rolename);
}
