package com.anweb.Finance.loan.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.anweb.Finance.loan.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	
	Customer findByCustomeruniqueno(String customeruniqueno);

	//Optional<Customer> findByEmailid(String emailid); // done by me 
	
	Customer findByEmailid(String emailid);
	
	@Modifying
	@Query("UPDATE Customer c SET c.password = :ps WHERE c.emailid = :emailid")
	void updatePassword(@Param("ps") String password, @Param("emailid") String emailid);
	
	Customer findByEmailidAndPasswordAndStatus(String username ,  String password, boolean status);


	Customer findByUsername(String username);

	@Query("SELECT c.username FROM Customer c")
	List<String> findAllUsernames();

	

	
	
	

}
