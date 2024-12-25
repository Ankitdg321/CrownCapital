package com.anweb.Finance.loan.exception;

//creating custom exception  called in exception handler
public class RoleNotFound extends RuntimeException {

	public RoleNotFound(String msg) { // constructor he of this class 

		super(msg);
	}

}

//custom exception like RoleNotFound, you can more precisely handle situations
//where a particular role is not found in your application, rather than relying on generic exceptions like RuntimeException.