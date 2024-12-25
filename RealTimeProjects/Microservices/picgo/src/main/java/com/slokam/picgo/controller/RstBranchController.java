package com.slokam.picgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picgo.entity.RstBranch;
import com.slokam.picgo.service.RstBranchService;

@RestController
@RequestMapping("RstBranch") 
public class RstBranchController {
	 @Autowired
	 private RstBranchService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<RstBranch>	 saveRstBranch(@RequestBody RstBranch obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<RstBranch>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<RstBranch>	 deleteRstBranch(@RequestBody RstBranch obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<RstBranch>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<RstBranch>> getAllRstBranch(){
		 List<RstBranch> list = service.getAll();
		 return new ResponseEntity<List<RstBranch>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<RstBranch> getByIdRstBranch(@PathVariable Integer id) {
		  RstBranch obj =  service.getById(id);
		  return new ResponseEntity<RstBranch>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<RstBranch>	 
	 deleteRstBranch(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<RstBranch>(HttpStatus.OK);
	 }
}

