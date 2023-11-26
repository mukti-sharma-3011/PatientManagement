package com.admission.hospital.PatientManagement.payloads;

public class JwtAuthRequest {
	private String username;
	private String password;
	public JwtAuthRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JwtAuthRequest(String username, String passowrd) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassowrd(String password) {
		this.password = password;
	}
	
}
