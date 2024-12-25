package com.anweb.Finance.loan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String bankName;
	
	private String bankAddress;
	
	private String bankEmail;
	
	private String bankContactNo;
	
	private String bankFax;
	
	private String bankIfsccode;
	
	private String bankAccountNumber;
	
	private String bankAccountHolderName;
	
	private String bankAccountType;
	
	private String atmCardNumeber;
	
	private String branchName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getBankEmail() {
		return bankEmail;
	}

	public void setBankEmail(String bankEmail) {
		this.bankEmail = bankEmail;
	}

	public String getBankContactNo() {
		return bankContactNo;
	}

	public void setBankContactNo(String bankContactNo) {
		this.bankContactNo = bankContactNo;
	}

	public String getBankFax() {
		return bankFax;
	}

	public void setBankFax(String bankFax) {
		this.bankFax = bankFax;
	}

	public String getBankIfsccode() {
		return bankIfsccode;
	}

	public void setBankIfsccode(String bankIfsccode) {
		this.bankIfsccode = bankIfsccode;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getBankAccountHolderName() {
		return bankAccountHolderName;
	}

	public void setBankAccountHolderName(String bankAccountHolderName) {
		this.bankAccountHolderName = bankAccountHolderName;
	}

	public String getBankAccountType() {
		return bankAccountType;
	}

	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	public String getAtmCardNumeber() {
		return atmCardNumeber;
	}

	public void setAtmCardNumeber(String atmCardNumeber) {
		this.atmCardNumeber = atmCardNumeber;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return "BankDetails [id=" + id + ", bankName=" + bankName + ", bankAddress=" + bankAddress + ", bankEmail="
				+ bankEmail + ", bankContactNo=" + bankContactNo + ", bankFax=" + bankFax + ", bankIfsccode="
				+ bankIfsccode + ", bankAccountNumber=" + bankAccountNumber + ", bankAccountHolderName="
				+ bankAccountHolderName + ", bankAccountType=" + bankAccountType + ", atmCardNumeber=" + atmCardNumeber
				+ ", branchName=" + branchName + "]";
	}
	
	
	

}
