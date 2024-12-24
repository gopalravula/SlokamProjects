package com.doc.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.doc.dto.doctorDto;
import com.doc.entity.doctor;

@Component
public interface doctorService {


	public abstract ResponseEntity<doctorDto> saved(doctorDto ddto) throws Exception;
	

	public abstract ResponseEntity<doctorDto> getbyid(int did)throws Exception;

	public abstract ResponseEntity<List<doctorDto>> getall()throws Exception;
	

	public abstract ResponseEntity<List<doctorDto>> getByDname(String dname)throws Exception;

	public abstract ResponseEntity<String> deletebyid(int did)throws Exception;
}
