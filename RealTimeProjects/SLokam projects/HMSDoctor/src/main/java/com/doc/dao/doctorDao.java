package com.doc.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.doc.dto.doctorDto;
import com.doc.entity.doctor;
import com.doc.repo.doctorRepo;

import jakarta.persistence.Entity;


@Component
public class doctorDao {

	@Autowired
	private doctorRepo jpt;
	
	@Autowired
	private ModelMapper mp;
	
	public ResponseEntity<doctorDto> saved(doctorDto ddto) throws Exception {
		
	doctor docte =	mp.map(ddto, doctor.class);
	
	jpt.save(docte);
	
		return new ResponseEntity<doctorDto>(ddto, HttpStatus.CREATED);
	}
	
	
	public ResponseEntity<doctorDto> getbyid(int did) throws Exception {
		
	   Optional<doctor> dentity =	jpt.findById(did);
	   doctorDto docte =	mp.map(dentity, doctorDto.class);
	   return new ResponseEntity<doctorDto>(docte, HttpStatus.CREATED);

	}


	public ResponseEntity<List<doctorDto>> getall() throws Exception {
		// TODO Auto-generated method stub
	     List<doctor> docent =  jpt.findAll();
		
   doctorDto[]  docdata = mp.map(docent, doctorDto[].class);
   
  List<doctorDto> ldata =  Arrays.asList(docdata);
		return new ResponseEntity<List<doctorDto>>(ldata, HttpStatus.OK);
	}


	public ResponseEntity<List<doctorDto>> getByName(String dname) throws Exception {
		
		
		  List<doctor> docent =  jpt.findByDname(dname);
		  doctorDto[]  docdata = mp.map(docent, doctorDto[].class);
		  List<doctorDto> ldata =  Arrays.asList(docdata);
		
		  return new ResponseEntity<List<doctorDto>>(ldata, HttpStatus.OK);
	}

}
