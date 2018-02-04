package com.example.demo.rest.objects;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Header {

	@NotBlank(message="Client Id should not be blank")
	@JsonProperty(value="clientId")
	private String clientId;
	
	@NotBlank(message="Client Name should not be blank")
	@JsonProperty(value="clientName")
	private String clientName;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	
}
