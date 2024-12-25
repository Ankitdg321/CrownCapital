package com.anweb.Finance.loan.service;

import com.anweb.Finance.loan.entity.LoanType;

import java.util.List;

public interface LoantypeService {
	
	void addLoanTypeData(LoanType loantype);   ///   **post
	

	LoanType findLoanDataUsingnName(String lname); // to fetch data using loanname  **get
	
	// as getall will fetch details of all so represent in list so we use list
	
	List<LoanType> getAllLoanTypeData(); // no need to give parameter bcz all find kr rahe h **get
	
	
	
	void updatingLoanData(LoanType loantype);    //**put  //mostly like a post methods only
	
	void deleteLoanTypeDatausingId(int id);   //**delete
	
	List<LoanType> getLoanDataUsingAmount(double loanamount);
	
	List<LoanType> getLoanDataUsingAmountorRate(double loanamount , double rateofinterest);
}
