package com.bridgelabz.fundoonotes.responses;

public class Responses {
	private String message;
	private int statusCode;
	private Object object;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Responses(String message, int statusCode, Object object) {
		this.message = message;
		this.statusCode = statusCode;
		this.object = object;
	}
	
	public Responses(String message, int statusCode) {
		this.message = message;
		this.statusCode = statusCode;
	}
}
