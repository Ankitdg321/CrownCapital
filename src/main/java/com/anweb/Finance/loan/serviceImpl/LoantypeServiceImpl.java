package com.anweb.Finance.loan.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anweb.Finance.loan.entity.LoanType;
import com.anweb.Finance.loan.repo.LoantypeRepository;
import com.anweb.Finance.loan.service.LoantypeService;

@Service
public class LoantypeServiceImpl implements LoantypeService // bcz we implements the interface only in class
{

	@Autowired
	private LoantypeRepository loantypeRepository; // this variable is used for accessing the methods etc not the class
													// directly

	@Override
	public void addLoanTypeData(LoanType loantype) {  // void so no need to return aanythin   ***post
		// TODO Auto-generated method stub

		System.out.println("loan data in repository :" + loantype);

		loantypeRepository.save(loantype); // now data will get save in database
	}

	@Override
	public LoanType findLoanDataUsingnName(String lname) { // need to return object           ***get
		// TODO Auto-generated method stub
		LoanType loantype = ((LoantypeRepository) loantypeRepository).findByLoanname(lname); // ussing method here
		
		return loantype; // i am sendind now the details that coming in loantype.  **i will call it in controller
	}

	@Override
	public List<LoanType> getAllLoanTypeData() {
		// TODO Auto-generated method stub
		return loantypeRepository.findAll();
	}

	@Override
	public void updatingLoanData(LoanType loantype) {
		// TODO Auto-generated method stub
		System.out.println("check updating loan data :" + loantype);
		
		loantypeRepository.save(loantype);
		
	}

	@Override
	public void deleteLoanTypeDatausingId(int id) {
		// TODO Auto-generated method stub
          System.out.println("check updating loan data :" + id);
		
		  loantypeRepository.deleteById(id);
	}

	@Override
	public List<LoanType> getLoanDataUsingAmount(double loanamount) {
  
		List<LoanType> loanlist=loantypeRepository.findByLoanamountLessThanEqual(loanamount);
  
		return loanlist;
	}

	@Override
	public List<LoanType> getLoanDataUsingAmountorRate(double loanamount, double rateofinterest) {
		
		List<LoanType> loanlistforboth =loantypeRepository.findByLoanamountOrRateofinterestLessThanEqual(loanamount,rateofinterest );
		// TODO Auto-generated method stub
		return loanlistforboth;
	}

}
