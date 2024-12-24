package com.hos.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.hos.Dto.adharDTO;
import com.hos.Dto.refdetailsDTO;
import com.hos.entity.adhar;
import com.hos.entity.patient;
import com.hos.entity.refdetails;
import com.hos.repo.patientRepo;
import com.hos.services.AdharServiceImpl;

import jakarta.transaction.Transactional;

@Component
public class AdharDao {

	
	@Autowired
	private ModelMapper mp;
	
	@Autowired
	private patientRepo jpt;

	private static final Logger log = LoggerFactory.getLogger(AdharDao.class);

	@Transactional
	public ResponseEntity<String> patientAdmissionPreRequirementAdhar(int patientid, adharDTO adto) {
		
		log.info("fetching the patient data");
	   Optional<patient> pcheck =	jpt.findById(patientid);
		
	   log.info("fetching the patient data--"+pcheck.get());
		patient n = pcheck.get();
		Integer pid = n.getPid();
		if(pid!=null)
		{
			if(n.getPbp() > 160 && n.getPtemp() >=100 )
			{
				log.info("Patient can be admitted");
				log.info("Patient required the adhar data");
				log.info("Adhar Dto converting to adhar entity started");
			adhar adentity =	mp.map(adto, adhar.class);
			log.info("Adhar Dto converting to adhar entity completed");
			log.info("adding  adhar to patient started");
			n.setAdh(adentity);
			log.info("adding  adhar to patient started"+n.toString());
			jpt.save(n);
			log.info("second try for using the flush adding  adhar to patient started"+n.toString());
			
				return new ResponseEntity<String>("Adhar added to Patient for Admission", HttpStatus.OK);
				
			}
			else
				
			{
				log.info("adding  adhar to patient not required");
				return new ResponseEntity<String>("Adhar not required any admission nor adhar data", HttpStatus.OK);
				
			}
		}
		else
		{
			log.info("no patient exist with the search of patient id");
			return new ResponseEntity<String>("No patient with the give patinet id", HttpStatus.OK);
				
			
		}
		
		
	}
	
    @Transactional
	public ResponseEntity<String> patientAdmissionRefDetailsPreRequirement(int pid, List<refdetailsDTO> rdto) {
		
		log.info("fetching the patient data");
	   Optional<patient> pcheck =	jpt.findById(pid);
		
	   log.info("fetching the patient data--"+pcheck.get());
		patient n = pcheck.get();
		  Long aidnumber = n.getAdh().getAnumber();
		Integer paid = n.getPid();
		
		   log.info(paid+"===fetching the patient data and ver the pid and adhar id==="+aidnumber);
		if(paid!=null)
		{
			if(n.getPbp() > 160 && n.getPtemp() >=100 && aidnumber!=null )
			{
				List<refdetails> k = new ArrayList<>();
				
				for(refdetailsDTO ad : rdto)
				{
					refdetails rdata =	mp.map(ad,refdetails.class);
					k.add(rdata);
				}
			n.setRefdata(k);
				jpt.save(n);
				return new ResponseEntity<String>("Adhar added to Patient for Admission", HttpStatus.OK);
				
			}
			else
				
			{
				log.info("please add   adhar to patient fist later ref details");
				return new ResponseEntity<String>("please add   adhar to patient fist later ref details", HttpStatus.OK);
				
			}
		}
		else
		{
			log.info("no patient exist with the search of patient id");
			return new ResponseEntity<String>("No patient with the give patinet id", HttpStatus.OK);
				
			
		}
	}
	
	
	
}
