package com.hos.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hos.Dto.adharDTO;
import com.hos.Dto.refdetailsDTO;
import com.hos.services.AdharServiceImpl;
import com.hos.services.IAdharService;

@RestController
@RequestMapping("adhardata")
public class AdharController {

	@Autowired
	private  AdharServiceImpl aimpl;
	
	private static final Logger log = LoggerFactory.getLogger(AdharController.class);
	
	
	@PutMapping("update/{pid}")
	public ResponseEntity<String> patientAdmissionPreRequirement(@PathVariable("pid") int pid,  @RequestBody adharDTO adto)
	{
		System.out.println("I am in  adhar card class ---");
		log.info("I am in  adhar card class ---");
		log.info("I am updating the patient pid--"+pid);
		log.info("Adhar DTO Object---"+adto);
		
	return aimpl.patientAdmissionPreRequirementAdhar(pid, adto);	
	}
	
	
	@PutMapping("updaterefdetails/{pid}")
	public ResponseEntity<String> patientAdmissionRefDetailsPreRequirement(@PathVariable("pid") int pid, 
			@RequestBody List<refdetailsDTO> rdto)
	{
		System.out.println("I am in  adhar card class ---");
		log.info("I am in  adhar card class ---");
		log.info("I am updating the patient pid--"+pid);
		log.info("Adhar DTO Object---"+rdto);
		
	return aimpl.patientAdmissionRefDetailsPreRequirement(pid, rdto);	
	}
}
