package com.slokam.picgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picgo.entity.Cust;
import com.slokam.picgo.service.CustService;

@RestController
@RequestMapping("Cust") 
public class CustController {
	 @Autowired
	 private CustService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Cust>	 saveCust(@RequestBody Cust obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Cust>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Cust>	 deleteCust(@RequestBody Cust obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Cust>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Cust>> getAllCust(){
		 List<Cust> list = service.getAll();
		 return new ResponseEntity<List<Cust>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Cust> getByIdCust(@PathVariable Integer id) {
		  Cust obj =  service.getById(id);
		  return new ResponseEntity<Cust>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<Cust>	 
	 deleteCust(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Cust>(HttpStatus.OK);
	 }
}

