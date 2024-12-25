package com.anweb.Finance.loan.dto;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Type;

import com.anweb.Finance.loan.entity.Address;
import com.anweb.Finance.loan.entity.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)//only include not null values 
public class CustomerDTO {
	
	@JsonInclude(JsonInclude.Include.NON_DEFAULT) // bcz default value aane vala he ignore karo
	private int id;

	private String customername;

	private String mobileno;

	private String customeruniqueno;

	@JsonInclude(JsonInclude.Include.NON_DEFAULT)
	private long aadharno;

	private String pancardno;

	private String emailid;

	private String username;

	private String password;

	@JsonInclude(JsonInclude.Include.NON_DEFAULT)
	private boolean status;

	private Address address;
	
	private Role role; // new add bcz in login me i want this data of role also

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getCustomeruniqueno() {
		return customeruniqueno;
	}

	public void setCustomeruniqueno(String customeruniqueno) {
		this.customeruniqueno = customeruniqueno;
	}

	public long getAadharno() {
		return aadharno;
	}

	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}

	public String getPancardno() {
		return pancardno;
	}

	public void setPancardno(String pancardno) {
		this.pancardno = pancardno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
