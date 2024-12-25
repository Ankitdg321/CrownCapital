package com.anweb.Finance.loan.serviceImpl;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.anweb.Finance.loan.dto.CustomerDTO;
import com.anweb.Finance.loan.entity.Customer;
import com.anweb.Finance.loan.exception.CustomerDataNotFound;
import com.anweb.Finance.loan.exception.PasswordNotMatch;
import com.anweb.Finance.loan.repo.CustomerRepository;
import com.anweb.Finance.loan.service.CustomerService;
import com.anweb.Finance.loan.utility.ConvertPojoToDto;
import com.anweb.Finance.loan.utility.UniqueCustomerNumberGenerator;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerrepo;
	
	@Autowired
	private JavaMailSender mailsender;

	@Override
	public void addCustomerDetails(Customer customer) {

		// combination of pan and mobile last four digits you can take any other also
		// like aadhar
		String unique = UniqueCustomerNumberGenerator.getUniqueCustomerNumber(customer.getPancardno(),
				customer.getMobileno());

		customer.setCustomeruniqueno(unique);

		customerrepo.save(customer);
		
	// mail sender code added 	
		System.out.println("mail send to customer");
		
		SimpleMailMessage msg =new SimpleMailMessage();
		msg.setTo("ankitdg321@gmail.com");
		msg.setSubject("Registration successfull !!!");
		msg.setText("Congratulation For Registration");
		
		mailsender.send(msg);
		
		System.out.println("mail sent !!!!");

	}

	@Override
	public CustomerDTO getCustomerDataUsingCustomeruniqueno(String customeruniqueno) {

//		Optional<Customer> optional =customerrepo.findByCustomeruniqueno(customeruniqueno);
//
//		if(optional.isPresent()){
//			return optional.get();
//		}else 
//			throw new CustomerDataNotFound("Data not found");

		// we can do this same null pointer exception handling in ObjectUtil class also
		// in place of optional class

		Customer customer = customerrepo.findByCustomeruniqueno(customeruniqueno);
		CustomerDTO customerDTO = ConvertPojoToDto.getCustomerDto(customer);

		if (!ObjectUtils.isEmpty(customer)) { // true if empty so i added ! to make true of falsse(bcz empty nhi h )...
			
			return customerDTO;

		} else
			throw new CustomerDataNotFound("Data not found for this :"+ customeruniqueno ); //bcz object is empty so not found na

	}

	@Override
	public void updateCustomerDetails(Customer customer) {

     System.out.println("check customer details : "+ customer);
     
     Customer customer2 = customerrepo.findByCustomeruniqueno(customer.getCustomeruniqueno());
     customer.setPassword(customer2.getPassword()); // this was a logic to remove null in passssword in database
     
     customerrepo.save(customer);
		
		
	}

//	@Override
//	public void forgetPassword(String emailid, String newpassword) {
//		
//	//	 Optional<Customer> userOptional = customerrepo.findByEmailid(emailid);
//	        
//	        if (!userOptional.isPresent()) {
//	            System.out.println("Email not found in the system.");
//	            return;
//	        }
//	        
//	        
//	        Customer customer = userOptional.get(); // name is useroptional by default
//	        Scanner sc = new Scanner(System.in);
//	        System.out.println("Enter your old password to update:");
//	        String oldPassword = sc.next();
//	        
//	        if(!customer.getPassword().equals(oldPassword)) {
//	        	
//	        	System.out.println("incorrect password entered recheck it !!!");
//	        	return;
//	        	
//	        }
//	       customer.setPassword(newpassword);
//	       customerrepo.save(customer );
//	       System.out.println("Password updated successfully.");
//	        
//
//     
//      
//      
//		
//	}

	@Override
	@Transactional  // to let transaction know about data modification by jpa @modify use hua h n 
	public void ResetPassword(String emailid, String oldpassword, String newpassword) {

      System.out.println("Password is updating");
      
      Customer customer= customerrepo.findByEmailid(emailid);
      
      
      if(customer!=null) {
    	  
    	  if (customer.getEmailid().equals(oldpassword)) {
    		  
    		  customerrepo.updatePassword(newpassword, emailid);
    		  
    	  }else throw new PasswordNotMatch("password not match");
    	  
      }else throw new CustomerDataNotFound("Customer Not Found ..!!!");
		
	}

	@Override
	public void forgetPassword(String emailid, String newpassword) {
		// TODO Auto-generated method stub
		
	}



}
