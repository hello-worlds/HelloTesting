package com.richasdy.HelloTesting.JUnit;

public class MessageUtil {
	
	private String message;

	public MessageUtil(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String salutationMessage(){
		return "Hi!" +message;
	}
	
	public String printMessage(){
		System.out.println(message);
		return message;
	}

}
