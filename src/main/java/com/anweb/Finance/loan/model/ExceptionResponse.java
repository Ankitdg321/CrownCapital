package com.anweb.Finance.loan.model;

public class ExceptionResponse { // like pojo class for handling exception
	
	private String uri;  // kis uri pe error he
	
	private String errorMsg; // kya error he

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Override
	public String toString() {
		return "ExceptionResponse [uri=" + uri + ", errorMsg=" + errorMsg + "]";
	}

}
