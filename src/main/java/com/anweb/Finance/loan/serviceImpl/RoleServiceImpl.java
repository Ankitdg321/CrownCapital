package com.anweb.Finance.loan.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.management.relation.RoleNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anweb.Finance.loan.entity.Role;
import com.anweb.Finance.loan.exception.RoleNotFound;
import com.anweb.Finance.loan.repo.RoleRepository;
import com.anweb.Finance.loan.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository rolerepository;

	@Override
	public void addRoleData(Role role) {

		// TODO Auto-generated method stub

		System.out.println("Check Role Data :" + role);

		rolerepository.save(role);

	}

	@Override
	public Role getRollDataByName(String rollname) {
		// objectutil claass is also use to ObjectUtils is a utility class
		// with many static methods for dealing with objects in general. It's part of an
		// external library (Apache Commons).
		// It's a toolbox of static methods for handling objects, particularly dealing
		// with null values.

		Optional<Role> optional = rolerepository.findByRollname(rollname); // just like list when i want data in list
																			// i use optional class when null pointer
																			// error
																			// chances are more

		if (optional.isPresent()) { // if in database role (data )is present

			return optional.get(); // option,get will fetch that role from data base then

		} else

			throw new RoleNotFound("Role not found"); // if no data for that role found it will return this msg but it
														// avoided null pointer exception
	}

	@Override
	public List<Role> getAllRoleData() {

		// TODO Auto-generated method stub

		return rolerepository.findAll();
	}

	@Override
	public void UpdateRoleByName(Role role) {
		// TODO Auto-generated method stub

		rolerepository.save(role);

	}

	@Override
	public List<String> getRoleNameList() {

		List<String> rolllist = rolerepository.findAllRollname();

		return rolllist;
	}

}
