package com.anweb.Finance.loan.service;

import com.anweb.Finance.loan.dto.CustomerDTO;
import com.anweb.Finance.loan.model.LoginRequest;

public interface LoginService {
	
	//we use dto bcz jitna data chahiye utna hi use kar sakte he now 
	CustomerDTO getLoginData(String username , String password);

}
