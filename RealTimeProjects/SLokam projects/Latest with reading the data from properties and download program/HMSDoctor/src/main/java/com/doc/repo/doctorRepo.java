package com.doc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.doc.entity.doctor;

@Repository
public interface doctorRepo extends JpaRepository<doctor, Integer>{

	
	public abstract List<doctor> findByDname(String dname);
}
