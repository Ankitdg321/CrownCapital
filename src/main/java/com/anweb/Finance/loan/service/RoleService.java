package com.anweb.Finance.loan.service;

import java.util.*;

import com.anweb.Finance.loan.entity.Role;

public interface RoleService {

	public void addRoleData(Role role);
	
	Role getRollDataByName(String rollname);
	
	List<Role> getAllRoleData();
	
	public void UpdateRoleByName(Role role);
	
	List<String> getRoleNameList();
}
