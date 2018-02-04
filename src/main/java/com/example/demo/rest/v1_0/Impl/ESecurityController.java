package com.example.demo.rest.v1_0.Impl;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.rest.objects.HeaderResponse;
import com.example.demo.rest.objects.UserBean;
import com.example.demo.rest.objects.UserRequest;
import com.example.demo.rest.objects.UserResponse;
import com.example.demo.rest.v1_0.ESecurity;

@RestController
public class ESecurityController implements ESecurity{

	@Override
	public ResponseEntity<UserResponse> userDetails(@Valid @RequestBody UserRequest userRequest, Errors errors) {
		
		HeaderResponse headerResponse = new HeaderResponse();
		headerResponse.setClientId(userRequest.getHeader().getClientId());
		headerResponse.setClientName(userRequest.getHeader().getClientName());
		
		UserBean userBean  = new UserBean();
		userBean.setUserId(userRequest.getUserId());
		userBean.setPassword("XXXXXXX");
		
		UserResponse userResponse = new UserResponse();
		
		if(errors.hasErrors()) {
			userResponse.setHeaderResponse(headerResponse);
			userResponse.setResponseStatus("9001");
			userResponse.setDescription("Login Failure");
			userResponse.setUserBean(userBean);
			return ResponseEntity.status(200).body(userResponse);
		}
		
		userResponse.setHeaderResponse(headerResponse);
		userResponse.setResponseStatus("1001");
		userResponse.setDescription("LoginSuccess");
		userResponse.setUserBean(userBean);
		
		return ResponseEntity.status(200).body(userResponse);
	}

	
}
