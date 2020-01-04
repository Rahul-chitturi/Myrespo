package com.bridgelabz.fundoonotes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.fundoonotes.dto.UserDto;
import com.bridgelabz.fundoonotes.model.User;
import com.bridgelabz.fundoonotes.model.UserLogin;
import com.bridgelabz.fundoonotes.responses.Responses;
import com.bridgelabz.fundoonotes.service.ServiceInf;
import com.bridgelabz.fundoonotes.utility.JwtGenerator;

@RestController
public class RegisterController {

	@Autowired
	private ServiceInf service;

	@Autowired
	private JwtGenerator jwtGenerator;

	@PostMapping("/users/register")
	public ResponseEntity<Responses> register(@RequestBody UserDto userDto) {

		boolean result = service.register(userDto);
		if (result == true) {
			return ResponseEntity.status(HttpStatus.CREATED)
					.body(new Responses("Registration Successfully", 200, userDto));
		} else {
			return ResponseEntity.status(HttpStatus.ALREADY_REPORTED)
					.body(new Responses("User Already Exist", 400, userDto));
		}
	}

	@PostMapping("/user/login")
	public ResponseEntity<Responses> login(@RequestBody UserLogin userLogin) {
		User user = service.login(userLogin);

		if (user != null) {
			String token = jwtGenerator.jwtToken(user.getId());
			return ResponseEntity.status(HttpStatus.ACCEPTED).header("Login Successfully", userLogin.getEmail())
					.body(new Responses(token, 200, userLogin));

		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body(new Responses("Sorry Something went wrong!!!", 400, userLogin));
		}
	}
}
