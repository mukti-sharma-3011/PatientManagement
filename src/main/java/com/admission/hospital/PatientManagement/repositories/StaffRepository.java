package com.admission.hospital.PatientManagement.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admission.hospital.PatientManagement.entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, String> {
	public Optional<Staff> findByEmploymentNumber(String employmentNumber);
}
