package com.admission.hospital.PatientManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admission.hospital.PatientManagement.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{
	
}
