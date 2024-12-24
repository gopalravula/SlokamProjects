package com.hos.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hos.Dto.patientDTO;
import com.hos.dao.patientDao;
import com.hos.entity.patient;
import com.hos.repo.patientRepo;

import jakarta.validation.Valid;

@Service
public class IpatSerImpl implements IPatientService{

	@Autowired
	private patientDao pdao;
	
	
	@Override
	public ResponseEntity<patientDTO> savep(patientDTO pt) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		return pdao.savep(pt);
		
		
	}


	@Override
	public ResponseEntity<patientDTO> getById(int pid) throws Exception {
		// TODO Auto-generated method stub
		return pdao.getById(pid);
	}


	@Override
	public ResponseEntity<List<patient>> getAll() throws Exception {
		// TODO Auto-generated method stub
		return pdao.getAll();
	}


	@Override
	public ResponseEntity<String> deletebyId(int pid) throws Exception {
		// TODO Auto-generated method stub
		return pdao.deletebyId(pid);
	}


	@Override
	public ResponseEntity<List<patient>> getByName(String pname) throws Exception {
		// TODO Auto-generated method stub
		return pdao.getByName(pname);
	}

	
	

}
