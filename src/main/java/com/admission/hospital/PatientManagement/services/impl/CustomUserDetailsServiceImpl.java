package com.admission.hospital.PatientManagement.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.admission.hospital.PatientManagement.entity.Staff;
import com.admission.hospital.PatientManagement.exceptions.ResourceNotFoundException;
import com.admission.hospital.PatientManagement.exceptions.UserNotFoundException;
import com.admission.hospital.PatientManagement.repositories.StaffRepository;
import com.admission.hospital.PatientManagement.services.StaffDetailsService;

@Service
public class CustomUserDetailsServiceImpl implements StaffDetailsService {
	@Autowired
	private StaffRepository staffRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Staff staff=staffRepository.findByEmploymentNumber(username).orElseThrow(()->new UserNotFoundException("Staff", "Employment Number", username));
		return staff;
	}

}
