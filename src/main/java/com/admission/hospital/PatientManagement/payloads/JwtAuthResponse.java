package com.admission.hospital.PatientManagement.payloads;


public class JwtAuthResponse {
	private String jwtToken;
	private String username;
	public JwtAuthResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JwtAuthResponse(String jwtToken, String username) {
		super();
		this.jwtToken = jwtToken;
		this.username = username;
	}
	public String getJwtToken() {
		return jwtToken;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
