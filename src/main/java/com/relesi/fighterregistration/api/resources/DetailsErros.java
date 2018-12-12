package com.relesi.fighterregistration.api.resources;

import java.util.Date;

public class DetailsErros {

	private Date timestamp;
	private String message;
	private String details;
	
	
	public DetailsErros(Date timestamp, String message, String datails) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = datails;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getDetails() {
		return details;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
