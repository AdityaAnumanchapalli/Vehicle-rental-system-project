package com.hexaware.vehiclerentalsystemproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long userid;
	 @NotBlank(message = "Email is mandatory")
	 @Email
	private String email;
	 @NotNull
	 @Size(min = 4, max = 15)
	private  String password;
	 @NotBlank(message = "Name is mandatory")
	private String name;
	 @NotBlank
	private String contactNumber;
	 @NotBlank
	private String aadhar;
	 @NotBlank
	private String drivingLicence;
	private String address;
	private String role;
	
	public User() {
		super();
	}
	
		public User(long userid, String email, String password, String name, String contactNumber, String aadhar,
		String drivingLicence, String address, String role) {
		super();
		this.userid = userid;
		this.email = email;
		this.password = password;
		this.name = name;
		this.contactNumber = contactNumber;
		this.aadhar = aadhar;
		this.drivingLicence = drivingLicence;
		this.address = address;
		this.role = role;
	}

		public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getDrivingLicence() {
		return drivingLicence;
	}
	public void setDrivingLicence(String drivingLicence) {
		this.drivingLicence = drivingLicence;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	

}

