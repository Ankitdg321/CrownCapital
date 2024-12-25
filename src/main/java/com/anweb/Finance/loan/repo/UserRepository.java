package com.anweb.Finance.loan.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anweb.Finance.loan.model.User;

public interface UserRepository extends JpaRepository<User, String> {

	public Optional<User> findByEmail(String email);
}
