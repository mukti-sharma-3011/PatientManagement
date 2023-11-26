package com.admission.hospital.PatientManagement.payloads;

public class StaffDto {
	private String staffId;
	private String name;
	private String employmentNumber;
	private String password;
	private String about;
	public StaffDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StaffDto(String staffId, String name, String employmentNumber, String password, String about) {
		super();
		this.staffId = staffId;
		this.name = name;
		this.employmentNumber = employmentNumber;
		this.password = password;
		this.about = about;
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmploymentNumber() {
		return employmentNumber;
	}
	public void setEmploymentNumber(String employmentNumber) {
		this.employmentNumber = employmentNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	
}
