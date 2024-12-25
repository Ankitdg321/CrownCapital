package com.anweb.Finance.loan.service;

import com.anweb.Finance.loan.dto.CustomerDTO;
import com.anweb.Finance.loan.entity.Customer;

public interface CustomerService {
	
	void addCustomerDetails(Customer customer);
	
	CustomerDTO getCustomerDataUsingCustomeruniqueno(String customeruniqueno);
	
	void updateCustomerDetails(Customer customer);
	
	void forgetPassword(String emailid , String newpassword);
	
	void ResetPassword(String emailid , String oldpassword ,String newpassword);

}
