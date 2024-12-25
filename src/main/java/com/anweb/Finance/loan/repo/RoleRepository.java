package com.anweb.Finance.loan.repo;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.anweb.Finance.loan.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

	Optional<Role> findByRollname(String rollname);

	//@Query("SELECT r.rollname FROM Role r")
	//List<String> findAllRollname();
	
	@Query(value = "select rollname from Role")  // i hav used simple sql query
	List<String> findAllRollname();   // findall bcz i want all rollname

	@Query("SELECT r.rollname FROM Role r")
    List<String> findAllRollnames();

	

}
