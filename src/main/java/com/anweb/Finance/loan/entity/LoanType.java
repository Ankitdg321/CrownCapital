package com.anweb.Finance.loan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(unique = true, nullable = false) // column value should be unique and not null
	private String loanname;

	private String ltype; // it is loantype

	private double loanamount;
	
	private double rateofinterest;

	

	

	@Override
	public String toString() {
		return "LoanType [id=" + id + ", loanname=" + loanname + ", ltype=" + ltype + ", loanamount=" + loanamount
				+ ", rateofinterest=" + rateofinterest + "]";
	}

	public double getRateofinterest() {
		return rateofinterest;
	}

	public void setRateofinterest(double rateofinterest) {
		this.rateofinterest = rateofinterest;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoanname() {
		return loanname;
	}

	public void setLoanname(String loanname) {
		this.loanname = loanname;
	}

	public String getLtype() {
		return ltype;
	}

	public void setLtype(String ltype) {
		this.ltype = ltype;
	}

	public double getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(double loanamount) {
		this.loanamount = loanamount;
	}

}
