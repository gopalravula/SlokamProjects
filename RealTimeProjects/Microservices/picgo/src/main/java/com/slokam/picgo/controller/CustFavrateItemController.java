package com.slokam.picgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picgo.entity.CustFavrateItem;
import com.slokam.picgo.service.CustFavrateItemService;

@RestController
@RequestMapping("CustFavrateItem") 
public class CustFavrateItemController {
	 @Autowired
	 private CustFavrateItemService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<CustFavrateItem>	 saveCustFavrateItem(@RequestBody CustFavrateItem obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<CustFavrateItem>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<CustFavrateItem>	 deleteCustFavrateItem(@RequestBody CustFavrateItem obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<CustFavrateItem>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<CustFavrateItem>> getAllCustFavrateItem(){
		 List<CustFavrateItem> list = service.getAll();
		 return new ResponseEntity<List<CustFavrateItem>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<CustFavrateItem> getByIdCustFavrateItem(@PathVariable Integer id) {
		  CustFavrateItem obj =  service.getById(id);
		  return new ResponseEntity<CustFavrateItem>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<CustFavrateItem>	 
	 deleteCustFavrateItem(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<CustFavrateItem>(HttpStatus.OK);
	 }
}

