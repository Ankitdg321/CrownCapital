package com.anweb.Finance.loan.model;

public class RoleAssign {
	
	private String username;
	
	private String rolename;

	@Override
	public String toString() {
		return "RoleAssign [username=" + username + ", rolename=" + rolename + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	} 

}
