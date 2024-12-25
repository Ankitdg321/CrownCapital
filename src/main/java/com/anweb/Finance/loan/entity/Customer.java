package com.anweb.Finance.loan.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@DynamicUpdate
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // this id is for database only 
	
	private String customername;
	
	private String mobileno;
	
	private String customeruniqueno; // unique no for every customer bcz ankit nam ke do cus bhi ho sakte he

	private long aadharno;

	private String pancardno;

	private String emailid;

	// for login
	private String username;

	@JsonIgnore  // to avoid showing password at login itself but it is giving null value at database
	private String password;

	@Type(type = "yes_no") // so that stsuss y /n ayega   in place of b in database
	private boolean status;

	@OneToOne(cascade = CascadeType.ALL) //fetch lazy to avoid address show every time only show when called by getcustomerdata not at login itself 
	private Address address;
	//The @OneToOne annotation is used in JPA (Java Persistence API) to specify a
	//one-to-one relationship between two entities. In your example, the Customer entity 
	//has a one-to-one relationship with the Address entity.
	//@OneToOne
	//Relationship Type: This specifies that each Customer has exactly one associated
	//Address, and each Address is associated with exactly one Customer
	//cascade = CascadeType.ALL
	//Cascade Operations: This means that any operation performed on the Customer entity will be
	//cascaded to the Address entity. For example
	//When you create a Customer and set an Address, saving the Customer will also save the Address automatically because of the cascade.
	//If you delete the Customer, the associated Address will also be deleted.
	
	//@OneToOne(cascade = {CascadeType.PERSIST,CascadeType.ALL})
	
	@OneToOne(cascade = CascadeType.PERSIST) // we done persistif i delete user role delete nhi hona chaiiye issliye
	private Role role;               
	
	
	
	
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
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


	@Override
	public String toString() {
		return "Customer [id=" + id + ", customername=" + customername + ", mobileno=" + mobileno
				+ ", customeruniqueno=" + customeruniqueno + ", aadharno=" + aadharno + ", pancardno=" + pancardno
				+ ", emailid=" + emailid + ", username=" + username + ", password=" + password + ", status=" + status
				+ ", address=" + address + ", role=" + role + "]";
	}

}
