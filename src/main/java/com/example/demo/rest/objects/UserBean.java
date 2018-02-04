package com.example.demo.rest.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserBean {

	@JsonProperty(value="user_Id")
	private String userId;

	@JsonProperty(value="password")
	private String password;

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
