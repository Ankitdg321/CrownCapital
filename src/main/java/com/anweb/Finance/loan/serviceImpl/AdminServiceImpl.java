package com.anweb.Finance.loan.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anweb.Finance.loan.entity.Customer;
import com.anweb.Finance.loan.entity.Role;
import com.anweb.Finance.loan.exception.CustomerDataNotFound;
import com.anweb.Finance.loan.repo.CustomerRepository;
import com.anweb.Finance.loan.repo.RoleRepository;
import com.anweb.Finance.loan.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private CustomerRepository customerrepository;
	
	@Autowired
	private RoleRepository rolerepository;

	@Override
	public List<String> getAllRoleNames() {
		List<String> customers = rolerepository.findAllRollnames();
		return customers;
	}

	@Override
	public List<String> getAllUsernames() {
		// TODO Auto-generated method stub
		List<String> customers = customerrepository.findAllUsernames();
		return customers;
	}

	@Override
	public void assignRoleToUser(String username, String rolename) {

      Customer customer = customerrepository.findByUsername(username);
      
      if(customer!=null) {
    	  Role role = rolerepository.findByRollname(rolename).get();
    	  customer.setRole(role);// i have set role in customer now 
    	  customerrepository.save(customer); // and i have saved that role in repository now for this customer 
      }
      else {
    	  throw new CustomerDataNotFound("Customer not found for :"+ username);
      }
		
	}

}
