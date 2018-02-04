package com.example.demo.rest.objects;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRequest {

	@JsonProperty(value="header")
	@Valid
	Header header;
	
	@NotBlank(message="UserId Should not Be blank")
	@JsonProperty(value="user_Id")
	private String userId;

	@NotBlank(message="Password Should not be blank")
	@JsonProperty(value="password")
	private String password;

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
