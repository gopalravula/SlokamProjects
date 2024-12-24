package com.hos.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hos.Dto.adharDTO;
import com.hos.Dto.refdetailsDTO;
import com.hos.controller.AdharController;
import com.hos.dao.AdharDao;

@Service
public  class AdharServiceImpl implements IAdharService{

	@Autowired
	private AdharDao adao;
	private static final Logger log = LoggerFactory.getLogger(AdharServiceImpl.class);

	
	@Override
	public ResponseEntity<String> patientAdmissionPreRequirementAdhar(int patientid, adharDTO adto) {
	
		log.info("I am in service class");
		return adao.patientAdmissionPreRequirementAdhar(patientid, adto);
	}

	

	public ResponseEntity<String> patientAdmissionRefDetailsPreRequirement(int pid, List<refdetailsDTO> rdto) {
		// TODO Auto-generated method stub
		log.info("I am in service class");
		return adao.patientAdmissionRefDetailsPreRequirement(pid, rdto);

	}

}
