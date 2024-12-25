package com.anweb.Finance.loan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anweb.Finance.loan.entity.LoanType;

@Repository
public interface LoantypeRepository extends JpaRepository<LoanType, Integer> {

	LoanType findByLoanname(String lname); // then in loan service impl you call this method.

	List<LoanType> findByLoanamountLessThanEqual(double loanamount);

	List<LoanType> findByLoanamountOrRateofinterestLessThanEqual(double loanamount, double rateofinterest);
     // only variables in method first letter must be capital
	
	
}
