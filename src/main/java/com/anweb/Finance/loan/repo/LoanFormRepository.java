package com.anweb.Finance.loan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anweb.Finance.loan.entity.LoanForm;

@Repository
public interface LoanFormRepository extends JpaRepository<LoanForm, Integer> {

}
