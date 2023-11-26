package com.admission.hospital.PatientManagement.services.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admission.hospital.PatientManagement.entity.Patient;
import com.admission.hospital.PatientManagement.exceptions.ResourceNotFoundException;
import com.admission.hospital.PatientManagement.payloads.PatientDto;
import com.admission.hospital.PatientManagement.repositories.PatientRepository;
import com.admission.hospital.PatientManagement.services.PatientService;
import com.admission.hospital.PatientManagement.util.AdmissionStatus;

@Service
public class PatientServiceImpl implements PatientService{
	@Autowired
	private PatientRepository patientRepo;
	@Autowired
	private ModelMapper modelMapper;
	@Override
	public List<PatientDto> getPatients() {
		List<Patient> patients=patientRepo.findAll();
		List<PatientDto> patientDtos=patients.stream().map((patientDto)->modelMapper.map(patientDto, PatientDto.class)).collect(Collectors.toList());
		return patientDtos;
	}
	@Override
	public PatientDto addPatient(PatientDto patientDto) {
		Patient patient=modelMapper.map(patientDto, Patient.class);
		patient.setStatus(AdmissionStatus.ADMIT);
		patient.setAdmissionDate(new Date());
		Patient addedPatient=patientRepo.save(patient);
		PatientDto addedPatientDto=modelMapper.map(addedPatient, PatientDto.class);
		return addedPatientDto;
		
	}
	@Override
	public PatientDto removePatient(Integer patientId) {
		Patient patient=patientRepo.findById(patientId).orElseThrow(()->new ResourceNotFoundException("Patient", "Patient-ID", patientId));
		patient.setStatus(AdmissionStatus.DISCHARGE);
		patient.setDischargeDate(new Date());
		return modelMapper.map(patient, PatientDto.class);
	}
	
}
