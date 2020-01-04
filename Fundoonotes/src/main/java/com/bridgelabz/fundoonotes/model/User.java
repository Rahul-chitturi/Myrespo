package com.bridgelabz.fundoonotes.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "User")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "firstName", nullable = false)
	@NotEmpty(message = "Invalied FirstName")
	private String firstName;

	@Column(name = "lastName", nullable = false)
	@NotEmpty(message = "Invalied LastName")
	private String lastName;

	@Column(name = "email", nullable = false, unique = true)
	@NotEmpty(message = "Invalied Email Id")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "phoneNumber")
	private long phoneNumber;

	@Column(columnDefinition = "boolean default false")
	private boolean isVerified;

	@Column(name = "createdAt")
	private Date createdAt;

	

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public User() {

	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public User(int id, @NotEmpty(message = "Invalied FirstName") String firstName,
			@NotEmpty(message = "Invalied LastName") String lastName,
			@NotEmpty(message = "Invalied Email Id") String email, String password, long phoneNumber,
			boolean isVerified, Date createdAt) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.isVerified = isVerified;
		this.createdAt = createdAt;
	}


	
}
