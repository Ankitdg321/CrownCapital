package com.anweb.Finance.loan.utility;

public class UniqueCustomerNumberGenerator {
	
	public static String getUniqueCustomerNumber(String pancardno , String mobileno) {
		
		String uniqmob = mobileno.substring(6);
		
		String unique = pancardno+uniqmob;
		
		return unique ;
		
	}

}
