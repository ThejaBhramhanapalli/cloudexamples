package com.example.demo.rest.v1_0;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.rest.objects.UserRequest;
import com.example.demo.rest.objects.UserResponse;

@RequestMapping("/rest/v1_0")
public interface ESecurity {
	
	@PostMapping(value="/userDetails",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserResponse> userDetails(UserRequest userRequest,Errors errors);

}
