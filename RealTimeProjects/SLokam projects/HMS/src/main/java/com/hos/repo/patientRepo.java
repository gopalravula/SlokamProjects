package com.hos.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hos.entity.patient;
@Repository
public interface patientRepo extends JpaRepository<patient, Integer>{

	public abstract List<patient> getByPname(String pname);
}
