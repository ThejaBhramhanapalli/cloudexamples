package com.example.demo.rest.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResponse {

	@JsonProperty(value="responseHeader")
	private HeaderResponse headerResponse;
	
	@JsonProperty(value="user")
	private UserBean userBean;
	
	@JsonProperty(value="status")
	private String responseStatus;
	
	@JsonProperty(value="description")
	private String description;

	public HeaderResponse getHeaderResponse() {
		return headerResponse;
	}

	public void setHeaderResponse(HeaderResponse headerResponse) {
		this.headerResponse = headerResponse;
	}

	public String getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}
	
	
	
	
	
}
