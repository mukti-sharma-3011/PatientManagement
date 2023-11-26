package com.admission.hospital.PatientManagement.services;

import java.util.List;

import com.admission.hospital.PatientManagement.entity.Staff;
import com.admission.hospital.PatientManagement.payloads.StaffDto;

public interface StaffService {
	List<StaffDto> getAllStaffMembers();
	StaffDto addStaffMember(StaffDto staffDto);
}
