package com.javatechie.spring.mockito.api.model;




public class Response {
	private String message;
	public String getMessage() {
		return message;
	}
	public Response()
	{
		
	}
	public Response(String message, boolean status) {
		
		this.message = message;
		this.status = status;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	private boolean status;
}
