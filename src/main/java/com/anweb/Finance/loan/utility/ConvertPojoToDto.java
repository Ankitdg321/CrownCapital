package com.anweb.Finance.loan.utility;

import com.anweb.Finance.loan.dto.CustomerDTO;
import com.anweb.Finance.loan.entity.Customer;

public class ConvertPojoToDto {
	
	//there is a static method return dto of customer and taking varibles of customer
	public static CustomerDTO getCustomerDto(Customer customer) {
		
		CustomerDTO customerDTO= new CustomerDTO();
		
		customerDTO.setId(customer.getId());
		customerDTO.setUsername(customer.getUsername());
		customerDTO.setAadharno(customer.getAadharno());
		customerDTO.setAddress(customer.getAddress());
		customerDTO.setCustomername(customer.getCustomername());
		customerDTO.setCustomeruniqueno(customer.getCustomeruniqueno());
		customerDTO.setEmailid(customer.getEmailid());
		customerDTO.setMobileno(customer.getMobileno());
		customerDTO.setPancardno(customer.getPancardno());
		customerDTO.setPassword(customer.getPassword());
		customerDTO.setStatus(customer.isStatus());
		
		
		
		return customerDTO;
	}

}
