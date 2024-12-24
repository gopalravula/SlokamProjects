package com.doc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doc.dto.doctorDto;
import com.doc.service.doctorserviceImp;

import io.swagger.v3.oas.annotations.Operation;





@RestController
@RequestMapping("doctor")
public class doctorController {

	@Autowired
	private doctorserviceImp ser;
	  
	@PostMapping("saved")
	public ResponseEntity<doctorDto> dsave(@RequestBody doctorDto dto) throws Exception
	{
		return ser.saved(dto); 
	}
	
	@GetMapping("getbyid/{did}")
	@Operation(summary = "Looking for Doctor based on ID", description = "Fetches from internal Database OPeration")
	public ResponseEntity<doctorDto> getbyid(@PathVariable("did") int did) throws Exception
	{
		return ser.getbyid(did); 
	}
	
	
	@GetMapping("getbydname/{dname}")
	public ResponseEntity<List<doctorDto>> getByDname(@PathVariable("dname") String dname) throws Exception
	{
		return ser.getByDname(dname);
	}
	
	
	@GetMapping("getall")
	public ResponseEntity<List<doctorDto>> getall() throws Exception
	{
		return ser.getall();
	}
	
	@DeleteMapping("deletebyid/{did}")
	public ResponseEntity<String> deletebyId(@PathVariable("did") int did) throws Exception
	{
		return ser.deletebyid(did);
	}
}
