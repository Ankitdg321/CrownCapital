package com.anweb.Finance.loan.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class LoanForm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String loanApplicantName;
	
	private String loanApplicationId; // based on current date ie 202405071234 means 2024-05-07 + random numbers 
	
	private String loanName;
	
	private String loanType;
	
	private double loanAmount;
	
	private double loanEmi;
	
	private int loantenure;
	
	private float rateOfInterest;
	
	private String marritalStatus;
	
	private int age;

	private String pancardno;

	private String email;
	
	private long aadharno;

	private String contactNo;
	
	private String existingLoan;
	
	private String existingLoanType;
	
	private String existingLoanAmount;
	
	private String existinRateofInterest;
	
	private String existinLoanEmi;
	
	private String loanFormStatus;
	
	private String gender;
	
	private String permanentAddress;

	private String currentAddress;
	                 //during inseertion
    private String createdBy;//if i login then store my email add here else if any other represenatvie done then store his email
    
    private String updatedBy; //for kisne update/modify kiya 
    
    private String createdDate;
    
    private String updatedDate;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private EmploymentDetails employmentDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LegalDocument legalDocument;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoanApplicationId() {
		return loanApplicationId;
	}

	public void setLoanApplicationId(String loanApplicationId) {
		this.loanApplicationId = loanApplicationId;
	}

	public String getLoanName() {
		return loanName;
	}

	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getLoanEmi() {
		return loanEmi;
	}

	public void setLoanEmi(double loanEmi) {
		this.loanEmi = loanEmi;
	}

	public int getLoantenure() {
		return loantenure;
	}

	public void setLoantenure(int loantenure) {
		this.loantenure = loantenure;
	}

	public float getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public String getMarritalStatus() {
		return marritalStatus;
	}

	public void setMarritalStatus(String marritalStatus) {
		this.marritalStatus = marritalStatus;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPancardno() {
		return pancardno;
	}

	public void setPancardno(String pancardno) {
		this.pancardno = pancardno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getAadharno() {
		return aadharno;
	}

	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getExistingLoan() {
		return existingLoan;
	}

	public void setExistingLoan(String existingLoan) {
		this.existingLoan = existingLoan;
	}

	public String getExistingLoanType() {
		return existingLoanType;
	}

	public void setExistingLoanType(String existingLoanType) {
		this.existingLoanType = existingLoanType;
	}

	public String getExistingLoanAmount() {
		return existingLoanAmount;
	}

	public void setExistingLoanAmount(String existingLoanAmount) {
		this.existingLoanAmount = existingLoanAmount;
	}

	public String getExistinRateofInterest() {
		return existinRateofInterest;
	}

	public void setExistinRateofInterest(String existinRateofInterest) {
		this.existinRateofInterest = existinRateofInterest;
	}

	public String getExistinLoanEmi() {
		return existinLoanEmi;
	}

	public void setExistinLoanEmi(String existinLoanEmi) {
		this.existinLoanEmi = existinLoanEmi;
	}

	public String getLoanFormStatus() {
		return loanFormStatus;
	}

	public void setLoanFormStatus(String loanFormStatus) {
		this.loanFormStatus = loanFormStatus;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	
	

	public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	public EmploymentDetails getEmploymentDetails() {
		return employmentDetails;
	}

	public void setEmploymentDetails(EmploymentDetails employmentDetails) {
		this.employmentDetails = employmentDetails;
	}

	public LegalDocument getLegalDocument() {
		return legalDocument;
	}

	public void setLegalDocument(LegalDocument legalDocument) {
		this.legalDocument = legalDocument;
	}

	
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}



	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	

	public String getLoanApplicantName() {
		return loanApplicantName;
	}

	public void setLoanApplicantName(String loanApplicantName) {
		this.loanApplicantName = loanApplicantName;
	}

	@Override
	public String toString() {
		return "LoanForm [id=" + id + ", loanApplicantName=" + loanApplicantName + ", loanApplicationId="
				+ loanApplicationId + ", loanName=" + loanName + ", loanType=" + loanType + ", loanAmount=" + loanAmount
				+ ", loanEmi=" + loanEmi + ", loantenure=" + loantenure + ", rateOfInterest=" + rateOfInterest
				+ ", marritalStatus=" + marritalStatus + ", age=" + age + ", pancardno=" + pancardno + ", email="
				+ email + ", aadharno=" + aadharno + ", contactNo=" + contactNo + ", existingLoan=" + existingLoan
				+ ", existingLoanType=" + existingLoanType + ", existingLoanAmount=" + existingLoanAmount
				+ ", existinRateofInterest=" + existinRateofInterest + ", existinLoanEmi=" + existinLoanEmi
				+ ", loanFormStatus=" + loanFormStatus + ", gender=" + gender + ", permanentAddress=" + permanentAddress
				+ ", currentAddress=" + currentAddress + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", bankDetails=" + bankDetails
				+ ", employmentDetails=" + employmentDetails + ", legalDocument=" + legalDocument + "]";
	}

	
	

}