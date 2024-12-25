package com.anweb.Finance.loan.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.anweb.Finance.loan.model.ExceptionResponse;
import com.anweb.Finance.loan.exception.RoleNotFound;

@ControllerAdvice //to handle exception at class level used //It makes the class a global "advice" for controllers,
                   //meaning that it will intercept exceptions thrown by any controller in the application.
public class ApplicationException {

	@ExceptionHandler(RoleNotFound.class)                      //to chk kiss request pe error aa raha he  
	 public ResponseEntity<ExceptionResponse> handleExceptionOne(HttpServletRequest request, RoleNotFound exception )
	{      //@ResponseBody ExceptionResponse can also be used when you simply want to return object .
		// we make ExceptionResponse  a class in model package or dto (data transfer object)package.
	   //@ResponseBody: This annotation ensures that 
	  //the returned ExceptionResponse object will be serialized into JSON (or XML) and sent as the response body to the client.	
		
		ExceptionResponse exceptionResponse = new ExceptionResponse();//object of this class
		exceptionResponse.setUri(request.getRequestURI()); // aapka jo bhi uri he set ho jayega exception me 
		exceptionResponse.setErrorMsg(exception.getMessage());   // so that custom exception msg printed
		
		return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);//// Returning ResponseEntity with custom status (e.g., 404 Not Found)
	 }                                // when you use @requestbody just return excetptionResponse;
	
	@ExceptionHandler(CustomerDataNotFound.class)                      
	 public ResponseEntity<ExceptionResponse> handleExceptionTwo(HttpServletRequest request, CustomerDataNotFound exception )
	{	
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setUri(request.getRequestURI()); 
		exceptionResponse.setErrorMsg(exception.getMessage());   
		
		return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);//// Returning ResponseEntity with custom status (e.g., 404 Not Found)
	 }
	
	@ExceptionHandler(PasswordNotMatch.class)                      
	 public ResponseEntity<ExceptionResponse> handleExceptionThree(HttpServletRequest request, PasswordNotMatch exception )
	{	
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setUri(request.getRequestURI()); 
		exceptionResponse.setErrorMsg(exception.getMessage());   
		
		return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);//// Returning ResponseEntity with custom status (e.g., 404 Not Found)
	 }
	
	@ExceptionHandler(InvalidUsernameAndPassword.class)                      
	 public ResponseEntity<ExceptionResponse> handleExceptionFour(HttpServletRequest request, InvalidUsernameAndPassword exception )
	{	
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setUri(request.getRequestURI()); 
		exceptionResponse.setErrorMsg(exception.getMessage());   
		
		return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);//// Returning ResponseEntity with custom status (e.g., 404 Not Found)
	 }
	 
	@ExceptionHandler(RoleNotAssingned.class)                      
	 public ResponseEntity<ExceptionResponse> handleExceptionFive(HttpServletRequest request, RoleNotAssingned exception )
	{	
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setUri(request.getRequestURI()); 
		exceptionResponse.setErrorMsg(exception.getMessage());   
		
		return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);//// Returning ResponseEntity with custom status (e.g., 404 Not Found)
	 }
	 
}
