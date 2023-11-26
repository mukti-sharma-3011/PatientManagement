package com.admission.hospital.PatientManagement.entity;



import java.util.Date;

import org.hibernate.annotations.Table;

import com.admission.hospital.PatientManagement.util.AdmissionStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer patientId;
	private String name;
	private Integer age;
	private String room;
	private String doctorName;
	private Date admissionDate;
	private Date dischargeDate;
	private Integer expenses;
	@Enumerated(EnumType.STRING)
	private AdmissionStatus status;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(Integer patientId, String name, Integer age, String room, String doctorName, Date admissionDate,
			Date dischargeDate,Integer expenses, AdmissionStatus status) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.room = room;
		this.doctorName = doctorName;
		this.admissionDate = admissionDate;
		this.dischargeDate=dischargeDate;
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
	public AdmissionStatus getStatus() {
		return status;
	}
	public void setStatus(AdmissionStatus status) {
		this.status = status;
	}
	public Date getDischargeDate() {
		return dischargeDate;
	}
	public void setDischargeDate(Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}
	
}
