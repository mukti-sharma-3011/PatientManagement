package com.admission.hospital.PatientManagement.entity;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Staff implements UserDetails{
	@Id
	private String staffId;
	private String name;
	private String employmentNumber;
	private String password;
	private String about;
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Staff(String staffId, String name, String employmentNumber, String password, String about) {
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
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.employmentNumber;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
}
