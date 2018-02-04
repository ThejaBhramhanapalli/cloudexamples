package com.example.demo.rest.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeaderResponse {

	@JsonProperty(value="clientId")
	private String clientId;
	
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
