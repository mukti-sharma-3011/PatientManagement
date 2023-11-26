package com.admission.hospital.PatientManagement.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admission.hospital.PatientManagement.payloads.PatientDto;
import com.admission.hospital.PatientManagement.services.PatientService;

@RestController
@RequestMapping("/api/")
public class AdmissionController {
	@Autowired
	private PatientService patientService;
	@GetMapping("patients/")
	public ResponseEntity<List<PatientDto>> getPatients(){
		List<PatientDto> patientDtos=patientService.getPatients();
		return new ResponseEntity<List<PatientDto>>(patientDtos,HttpStatus.OK);
	}
	@PostMapping("/patient/admit")
	public ResponseEntity<PatientDto> admitPatient(@RequestBody PatientDto patientDto){
		PatientDto patientDto2=patientService.addPatient(patientDto);
		return new ResponseEntity<>(patientDto2,HttpStatus.CREATED);
	}
	@PatchMapping("/patient/discharge/{patientId}")
	public ResponseEntity<PatientDto> removePatient(@PathVariable Integer patientId){
		PatientDto patientDto3=patientService.removePatient(patientId);
		return new ResponseEntity<PatientDto>(patientDto3,HttpStatus.OK);
	}
	@GetMapping("/current-user")
    public String getUsername(Principal principal) {
    	return principal.getName();
    }
}
