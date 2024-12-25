package com.anweb.Finance.loan.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anweb.Finance.loan.entity.LoanType;
import com.anweb.Finance.loan.service.LoantypeService;

@RestController

public class LoantypeController {

	@Autowired
	private LoantypeService loantypeservice; // this variable is used for accessing the methods etc not the class
												// directly

	@PostMapping(value = "/addloan") // to add the details
	public ResponseEntity<String> addingLoantypeData(@RequestBody LoanType loantype) { // i can use string or class name
																						// directly in requestentity

		System.out.println("check loan data : " + loantype);

		loantypeservice.addLoanTypeData(loantype); // for **post**put**delete no need to store the value into anything

		return new ResponseEntity<String>("loan type data added.", HttpStatus.OK);
	}

	@GetMapping(value = "/get/{loanname}") // to fetch the details //class name directly in request entity
	public ResponseEntity<LoanType> getloandata(@PathVariable String loanname) { // now i can fetch data by many wys by
												//for specific data				// loatype , loanname .not by id bcz
																					// we
																					// dont know id it maintain at data
																					// base level.we use loan name here
																					// thats why we kept it unique.
		System.out.println("check loan type data : " + loanname);

		LoanType loantype = loantypeservice.findLoanDataUsingnName(loanname);

		return new ResponseEntity<LoanType>(loantype, HttpStatus.OK); // you cannot pass class in return so loantype not
																		// LoanType ok.

	}

	@GetMapping(value = "/getAll") // to fecth details of all te loan datas // desing method for getall in
							// service**
	public ResponseEntity<List<LoanType>> getAllLoanData() {
                                                        //for all data no parameters provided   
		
		System.out.println("start fecthing all loan data :");

		List<LoanType> loanList = loantypeservice.getAllLoanTypeData();

		 return new ResponseEntity<List<LoanType>>(loanList, HttpStatus.OK);

	}
	
	//to update the data from earlier data we use putmapping
	@PutMapping(value = "/updateloan")
	public ResponseEntity<String> updateLoanTypeData(@RequestBody LoanType loantype){
		System.out.println("updating loan data : "+ loantype);
		loantypeservice.updatingLoanData(loantype);
		return new ResponseEntity<String>("loantype data updated", HttpStatus.OK);
	}
	
	//now i want to delete data and that too with id (we can do it by name too)
	@DeleteMapping(value = "/deletedata/{id}")
	public ResponseEntity<String> deleteLoanTypeData(@PathVariable int id){
		System.out.println("updating loan data : "+ id);
		loantypeservice.deleteLoanTypeDatausingId(id);
		return new ResponseEntity<String>("loantype data deleted", HttpStatus.OK);
	}
	
	@GetMapping(value ="/getloanbyamount/{loanamount}")
	public ResponseEntity<List<LoanType>> getLoanDataUsingAmount(@PathVariable double loanamount){
		List<LoanType> loanlistbyname= loantypeservice.getLoanDataUsingAmount(loanamount);
		 return new ResponseEntity<List<LoanType>>(loanlistbyname, HttpStatus.OK);
	}
	
	@GetMapping(value ="/getloanbyamount/{loanamount}/{rateofinterest}")
	public ResponseEntity<List<LoanType>> getLoanDataUsingAmount(@PathVariable double loanamount,@PathVariable double rateofinterest){
		List<LoanType> loanlistbyboth= loantypeservice.getLoanDataUsingAmountorRate(loanamount, rateofinterest);
		 return new ResponseEntity<List<LoanType>>(loanlistbyboth, HttpStatus.OK);
	}

}