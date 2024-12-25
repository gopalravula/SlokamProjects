package com.slokam.picgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picgo.entity.CustOrder;
import com.slokam.picgo.service.CustOrderService;

@RestController
@RequestMapping("CustOrder") 
public class CustOrderController {
	 @Autowired
	 private CustOrderService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<CustOrder>	 saveCustOrder(@RequestBody CustOrder obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<CustOrder>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<CustOrder>	 deleteCustOrder(@RequestBody CustOrder obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<CustOrder>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<CustOrder>> getAllCustOrder(){
		 List<CustOrder> list = service.getAll();
		 return new ResponseEntity<List<CustOrder>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<CustOrder> getByIdCustOrder(@PathVariable Integer id) {
		  CustOrder obj =  service.getById(id);
		  return new ResponseEntity<CustOrder>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<CustOrder>	 
	 deleteCustOrder(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<CustOrder>(HttpStatus.OK);
	 }
}

