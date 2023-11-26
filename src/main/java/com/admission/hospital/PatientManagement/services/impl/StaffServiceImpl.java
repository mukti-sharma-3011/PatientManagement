package com.admission.hospital.PatientManagement.services.impl;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.admission.hospital.PatientManagement.entity.Staff;
import com.admission.hospital.PatientManagement.payloads.StaffDto;
import com.admission.hospital.PatientManagement.repositories.StaffRepository;
import com.admission.hospital.PatientManagement.services.StaffService;

@Service
public class StaffServiceImpl implements StaffService {
	@Autowired
	private StaffRepository staffRepository;
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Override
	public List<StaffDto> getAllStaffMembers() {
		List<Staff> allStaff=staffRepository.findAll();
		List<StaffDto> allStaffDto=allStaff.stream().map((s)->modelMapper.map(s, StaffDto.class)).collect(Collectors.toList());
		
		return allStaffDto;
	}

	@Override
	public StaffDto addStaffMember(StaffDto staffDto) {
		Staff staff=modelMapper.map(staffDto, Staff.class);
		staff.setStaffId(UUID.randomUUID().toString());
		staff.setEmploymentNumber(staffDto.getEmploymentNumber());
		staff.setPassword(passwordEncoder.encode(staffDto.getPassword()));
		Staff addedStaff=staffRepository.save(staff);
		return modelMapper.map(addedStaff, StaffDto.class);
	}
}
