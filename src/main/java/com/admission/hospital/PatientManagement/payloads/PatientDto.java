package com.admission.hospital.PatientManagement.payloads;

import java.util.Date;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public class PatientDto {
	private Integer patientId;
	@NotEmpty
	@NotBlank
	private String name;
	@NotEmpty
	@NotBlank
	private Integer age;
	@NotEmpty
	@NotBlank
	private String room;
	@NotEmpty
	@NotBlank
	private String doctorName;
	@NotEmpty
	@NotBlank
	private Date admissionDate;
	@NotEmpty
	@NotBlank
	private Integer expenses;
	@NotEmpty
	@NotBlank
	private String status;
	public PatientDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientDto(Integer patientId, String name, Integer age, String room, String doctorName, Date admissionDate,
			Integer expenses, String status) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.room = room;
		this.doctorName = doctorName;
		this.admissionDate = admissionDate;
		this.expenses = expenses;
		this.status = status;
	}
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public Date getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}
	public Integer getExpenses() {
		return expenses;
	}
	public void setExpenses(Integer expenses) {
		this.expenses = expenses;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
