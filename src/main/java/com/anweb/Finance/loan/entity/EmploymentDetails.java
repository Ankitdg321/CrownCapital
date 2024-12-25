  package com.anweb.Finance.loan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

@Entity
public class EmploymentDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String organizationName;
	
	private String organizationAddress;
	
	private String organizationContactNo;
	
	private String organizationEmailId;
	
	private double empSalary;
	
	private String empWorkEmailId;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "yyyy-mmm-dd")
	private String joinDate;
	
	private int totalExperience;
	
	private String currentOrganizationExperience;
	
	private String organizationType;
	
	private String empPayroll;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getOrganizationAddress() {
		return organizationAddress;
	}

	public void setOrganizationAddress(String organizationAddress) {
		this.organizationAddress = organizationAddress;
	}

	public String getOrganizationContactNo() {
		return organizationContactNo;
	}

	public void setOrganizationContactNo(String organizationContactNo) {
		this.organizationContactNo = organizationContactNo;
	}

	public String getOrganizationEmailId() {
		return organizationEmailId;
	}

	public void setOrganizationEmailId(String organizationEmailId) {
		this.organizationEmailId = organizationEmailId;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpWorkEmailId() {
		return empWorkEmailId;
	}

	public void setEmpWorkEmailId(String empWorkEmailId) {
		this.empWorkEmailId = empWorkEmailId;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public int getTotalExperience() {
		return totalExperience;
	}

	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}

	public String getCurrentOrganizationExperience() {
		return currentOrganizationExperience;
	}

	public void setCurrentOrganizationExperience(String currentOrganizationExperience) {
		this.currentOrganizationExperience = currentOrganizationExperience;
	}

	public String getOrganizationType() {
		return organizationType;
	}

	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}

	public String getEmpPayroll() {
		return empPayroll;
	}

	public void setEmpPayroll(String empPayroll) {
		this.empPayroll = empPayroll;
	}

	@Override
	public String toString() {
		return "EmploymentDetails [id=" + id + ", organizationName=" + organizationName + ", organizationAddress="
				+ organizationAddress + ", organizationContactNo=" + organizationContactNo + ", organizationEmailId="
				+ organizationEmailId + ", empSalary=" + empSalary + ", empWorkEmailId=" + empWorkEmailId
				+ ", joinDate=" + joinDate + ", totalExperience=" + totalExperience + ", currentOrganizationExperience="
				+ currentOrganizationExperience + ", organizationType=" + organizationType + ", empPayroll="
				+ empPayroll + "]";
	}
	
	
	

}
