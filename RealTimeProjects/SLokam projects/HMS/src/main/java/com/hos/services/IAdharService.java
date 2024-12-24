package com.hos.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.hos.Dto.adharDTO;
import com.hos.Dto.refdetailsDTO;

@Component
public interface IAdharService {

	public abstract ResponseEntity<String> patientAdmissionPreRequirementAdhar(int patientid, adharDTO adto);
	
	public abstract ResponseEntity<String> patientAdmissionRefDetailsPreRequirement(int patientid, List<refdetailsDTO> adto);
	
}
