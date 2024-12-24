package com.hos.dao;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.hos.Dto.patientDTO;
import com.hos.entity.adhar;
import com.hos.entity.patient;
import com.hos.repo.patientRepo;


import jakarta.validation.Valid;

@Component
public class patientDao {

	@Autowired
	private ModelMapper mp;
	
	@Autowired
	private patientRepo jpt;
	private static final Logger log = LoggerFactory.getLogger(patientDao.class);

	
	public ResponseEntity<patientDTO> savep(patientDTO pt) throws Exception
	{
		
		
		log.info("convert patdto to patient entity startted"+pt.toString());
	patient p =	mp.map(pt, patient.class);
		
		log.info("convert patdto to patient entity completed pat entity Object"+p.toString());
			
		
		
		
		
		jpt.save(p);
		return new ResponseEntity<patientDTO>(pt, HttpStatus.CREATED);
		
	}


	public ResponseEntity<patientDTO> getById(int pid) throws Exception {
		
	Optional<patient> pdata =	jpt.findById(pid);
	
patientDTO pdto =	mp.map(pdata.get(), patientDTO.class);
		return new ResponseEntity<patientDTO>(pdto, HttpStatus.OK);
	}


	public ResponseEntity<List<patient>> getAll() {
		
		return new ResponseEntity<List<patient>>(jpt.findAll(), HttpStatus.OK);
	}


	public ResponseEntity<String> deletebyId(int pid) {
		jpt.deleteById(pid);
		return new ResponseEntity<String>("dleeted succefully", HttpStatus.OK) ;
	}


	public ResponseEntity<List<patient>> getByName(String pname) {
		
		
		List<patient> data =  jpt.getByPname(pname);
		return new ResponseEntity<List<patient>>(data, HttpStatus.OK);
	}

	
	
}
