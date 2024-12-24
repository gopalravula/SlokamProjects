package com.hos.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.hos.Dto.patientDTO;
import com.hos.entity.patient;

@Component
public interface IPatientService {

	public abstract ResponseEntity<patientDTO> savep(patientDTO pt) throws Exception;
	
	public abstract ResponseEntity<patientDTO> getById(int pid) throws Exception;
	
	public abstract ResponseEntity<List<patient>> getAll() throws Exception;
	
	public abstract ResponseEntity<String> deletebyId(int  pid) throws Exception;
	
	public abstract ResponseEntity<List<patient>> getByName(String pname) throws Exception;
	
	
}
