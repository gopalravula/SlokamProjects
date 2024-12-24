package com.doc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.doc.dao.doctorDao;
import com.doc.dto.doctorDto;
import com.doc.repo.doctorRepo;

@Service
public class doctorserviceImp implements doctorService{

	@Autowired
	private doctorDao dao;
	
	@Override
	public ResponseEntity<doctorDto> saved(doctorDto ddto) throws Exception {
		// TODO Auto-generated method stub
		return dao.saved(ddto);
	}

	@Override
	public ResponseEntity<doctorDto> getbyid(int did) throws Exception {
		// TODO Auto-generated method stub
		return dao.getbyid(did);
	}

	@Override
	public ResponseEntity<List<doctorDto>> getall() throws Exception {
		// TODO Auto-generated method stub
		return dao.getall();
	}

	@Override
	public ResponseEntity<List<doctorDto>> getByDname(String dname) throws Exception {
		// TODO Auto-generated method stub
		return dao.getByName(dname);
	}

	@Override
	public ResponseEntity<String> deletebyid(int did) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
