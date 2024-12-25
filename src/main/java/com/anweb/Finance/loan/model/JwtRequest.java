package com.anweb.Finance.loan.model;

import lombok.Builder;
import lombok.Data;

@Builder
public class JwtRequest {
	
	private String email;
	
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "JwtRequest [email=" + email + ", password=" + password + "]";
	}
	
	
	
	

}