package br.com.wilton.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable{

	private static final long serialVersionUID = 1L;

	private Date time;
	private String message;
	private String details;

	public ExceptionResponse(Date time, String message, String details) {
		super();
		this.time = time;
		this.message = message;
		this.details = details;
	}
	
	public Date getTime() {
		return time;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getDetails() {
		return details;
	}
}
