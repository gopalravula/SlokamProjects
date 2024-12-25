package com.slokam.picgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picgo.entity.CustFavrateRstBranch;
import com.slokam.picgo.service.CustFavrateRstBranchService;

@RestController
@RequestMapping("CustFavrateRstBranch") 
public class CustFavrateRstBranchController {
	 @Autowired
	 private CustFavrateRstBranchService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<CustFavrateRstBranch>	 saveCustFavrateRstBranch(@RequestBody CustFavrateRstBranch obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<CustFavrateRstBranch>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<CustFavrateRstBranch>	 deleteCustFavrateRstBranch(@RequestBody CustFavrateRstBranch obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<CustFavrateRstBranch>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<CustFavrateRstBranch>> getAllCustFavrateRstBranch(){
		 List<CustFavrateRstBranch> list = service.getAll();
		 return new ResponseEntity<List<CustFavrateRstBranch>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<CustFavrateRstBranch> getByIdCustFavrateRstBranch(@PathVariable Integer id) {
		  CustFavrateRstBranch obj =  service.getById(id);
		  return new ResponseEntity<CustFavrateRstBranch>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<CustFavrateRstBranch>	 
	 deleteCustFavrateRstBranch(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<CustFavrateRstBranch>(HttpStatus.OK);
	 }
}

