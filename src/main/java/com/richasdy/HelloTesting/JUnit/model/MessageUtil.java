package com.richasdy.HelloTesting.JUnit.model;

public class MessageUtil {

	private static final Exception ArithmeticException = null;
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

	public String salutationMessage() {
		
		// throw ArithmeticException;
		// triggered ArithmeticException
		// int a = 0;
		// int b = 1 / a;
		return "Hi!" + message;

	}

	public String printMessage() {
		System.out.println(message);
		return message;
	}

}
