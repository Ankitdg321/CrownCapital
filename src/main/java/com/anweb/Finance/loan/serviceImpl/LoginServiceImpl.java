package com.anweb.Finance.loan.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anweb.Finance.loan.dto.CustomerDTO;
import com.anweb.Finance.loan.entity.Customer;
import com.anweb.Finance.loan.exception.CustomerDataNotFound;
import com.anweb.Finance.loan.exception.InvalidUsernameAndPassword;
import com.anweb.Finance.loan.exception.RoleNotAssingned;
import com.anweb.Finance.loan.repo.CustomerRepository;
import com.anweb.Finance.loan.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public CustomerDTO getLoginData(String username, String password) {

		Customer customer = customerRepository.findByEmailidAndPasswordAndStatus(username, password, true);
		System.out.println("check customer login details ");

		if (customer != null) {
			
			if (customer.getRole()!=null) {

			CustomerDTO customerDTO = new CustomerDTO();
			customerDTO.setCustomeruniqueno(customer.getCustomeruniqueno());
			customerDTO.setEmailid(customer.getEmailid());
			customerDTO.setPassword(customer.getPassword());
            customerDTO.setRole(customer.getRole()); // must set the role now // now if i login by user and passs i will asigned role too
			return customerDTO;
			}
			else {
				throw new RoleNotAssingned("role not assigned for "+ username);
			}

		} else {
			throw new InvalidUsernameAndPassword("Invalid credentials enterted for :" + username);
		}

	}

}
