package com.hos.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.swagger.v3.oas.annotations.Operation;

import com.hos.Dto.doctorDto;
import com.hos.Dto.patientDTO;
import com.hos.entity.patient;
import com.hos.services.IpatSerImpl;


import jakarta.validation.Valid;

@RestController
@RequestMapping("patcont")
public class patientcontroller {

	@Autowired
	private IpatSerImpl ser;
	
	private static final Logger log = LoggerFactory.getLogger(patientcontroller.class);
	
	
	@PostMapping("psave")
	public ResponseEntity<patientDTO> psave(@Valid @RequestBody patientDTO pt) throws Exception
	{
		
		
		
			
		ser.savep(pt);
		
	
		return new ResponseEntity<patientDTO>(pt, HttpStatus.CREATED);
		
	}
	
	 @Operation(
		        summary = "Get patient BAsed in Patient ID",
		        description = "Retrieves the details of a specific patient from  database"
		       
		    )
	
	@GetMapping("getbyid/{pid}")
	public ResponseEntity<patientDTO> getByID(@PathVariable("pid") int pid) throws Exception
	{
		ResponseEntity<patientDTO> rs = null;
	
	     rs = 	ser.getById(pid);
	    patientDTO pinfo =    rs.getBody();
	    System.out.println("patient name--------------------------------------------------------"+pinfo);
	    
	    RestTemplate rt = new RestTemplate();
	    

	    String url = "http://localhost:8080/doctor/getbyid/1";
	doctorDto dt =    rt.getForObject(url, doctorDto.class);
	    System.out.println("Doctor name ----------------------------------------------------------------------------"+dt);
		return rs;
		
	}
	
	
	@GetMapping("getall")
	 @Scheduled(cron = "0 */3 * * * ?")
	public ResponseEntity<List<patient>> getall() throws Exception
	{
		//code to send mail
		//code to send msg
		//code daily morning

		
		log.info(" info method in logs I am in controller getall start  class --");
		
		log.warn(" warn method in logs I am in controller getall start class --");
		
		log.error(" error method in logs I am in controller getall start class --");
		
		
		
		 

		return ser.getAll();
		
	}
	
	
	@GetMapping("deleteby/{pid}")
	public ResponseEntity<String> deleteByID(@PathVariable("pid") int pid) throws Exception
	{
		
		log.trace(" trace method in logs I am in controller getbyid start class --"+pid);
		
		log.debug(" debub method in logs I am in controller getbyid startclass --"+pid);
		
		log.info(" info method in logs I am in controller getbyid start  class --"+pid);
		
		log.warn(" warn method in logs I am in controller getbyid start class --"+pid);
		
		log.error(" error method in logs I am in controller getbyid start class --"+pid);
		

		return ser.deletebyId(pid);
		
	}
	
	
	@GetMapping("getbyname/{pname}")
	public ResponseEntity<List<patient>> getbyName(@PathVariable("pname") String  pname) throws Exception
	{
		
		
		log.info(" info method in logs I am in controller getbyid start  class --"+pname);
		
		log.warn(" warn method in logs I am in controller getbyid start class --"+pname);
		
		log.error(" error method in logs I am in controller getbyid start class --"+pname);
		

		return ser.getByName(pname);
		
	}
	
	
}
