package com.admission.hospital.PatientManagement.services;

import java.util.List;

import com.admission.hospital.PatientManagement.payloads.PatientDto;

public interface PatientService {
	List<PatientDto> getPatients();
	PatientDto addPatient(PatientDto patientDto);
	PatientDto removePatient(Integer patientId);
}
