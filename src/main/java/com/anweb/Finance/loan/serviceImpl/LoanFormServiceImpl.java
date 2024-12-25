package com.anweb.Finance.loan.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anweb.Finance.loan.contant.Constants;
import com.anweb.Finance.loan.entity.LoanForm;
import com.anweb.Finance.loan.repo.LoanFormRepository;
import com.anweb.Finance.loan.service.LoanFormService;

@Service
public class LoanFormServiceImpl implements LoanFormService {

	@Autowired
	private LoanFormRepository loanformrepository;
	
	@Override
	public void applyLoanForm(LoanForm loanForm) {

		Date date = new Date(System.currentTimeMillis()); // for current date
		                                                        //must capital MMM
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MMM-dd  HH:mm:ss");//to convert date in string
		
		String createdDate = dateformat.format(date); //to do formatting
		
		loanForm.setCreatedDate(createdDate);// kis date pe create hua i have written it here 
		
		loanForm.setLoanFormStatus(Constants.LOANNEWSATUS);
		
        loanformrepository.save(loanForm);
		
	}

	
	
}
