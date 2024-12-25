package com.anweb.Finance.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anweb.Finance.loan.entity.LoanForm;
import com.anweb.Finance.loan.service.LoanFormService;

@RestController
public class LoanFormController {
	
	@Autowired
	private LoanFormService loanFormService;
	 
	@PostMapping(value  ="/applyLoan")
	public  String applyLoan(@RequestBody LoanForm loanForm) {
		
		System.out.println("check Loanform Data :"+ loanForm);
		
		loanFormService.applyLoanForm(loanForm);
		
		return " Loan Apply Completed ";
	}

}
