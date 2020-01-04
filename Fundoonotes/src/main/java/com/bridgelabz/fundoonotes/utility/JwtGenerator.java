package com.bridgelabz.fundoonotes.utility;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;

@Component
public class JwtGenerator {
	private static final String SCERET="qwertyuiop";
	
	public String jwtToken(long a)
	{
		String token=null;
		try {
			token=JWT.create().withClaim("Id",a).sign(Algorithm.HMAC512(SCERET));
		} catch (IllegalArgumentException | JWTCreationException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return token;
	}
	
	public int parse(String string) throws JWTVerificationException, IllegalArgumentException, UnsupportedEncodingException
	{
		Integer userId=0;
		if(string!=null)
		{
			userId=JWT.require(Algorithm.HMAC512(SCERET)).build().verify(string).getClaim("Id").asInt();
		}
		return userId;
	}
}
