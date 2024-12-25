package com.slokam.picgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picgo.entity.CustFavrateRstBrand;
import com.slokam.picgo.service.CustFavrateRstBrandService;

@RestController
@RequestMapping("CustFavrateRstBrand") 
public class CustFavrateRstBrandController {
	 @Autowired
	 private CustFavrateRstBrandService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<CustFavrateRstBrand>	 saveCustFavrateRstBrand(@RequestBody CustFavrateRstBrand obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<CustFavrateRstBrand>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<CustFavrateRstBrand>	 deleteCustFavrateRstBrand(@RequestBody CustFavrateRstBrand obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<CustFavrateRstBrand>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<CustFavrateRstBrand>> getAllCustFavrateRstBrand(){
		 List<CustFavrateRstBrand> list = service.getAll();
		 return new ResponseEntity<List<CustFavrateRstBrand>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<CustFavrateRstBrand> getByIdCustFavrateRstBrand(@PathVariable Integer id) {
		  CustFavrateRstBrand obj =  service.getById(id);
		  return new ResponseEntity<CustFavrateRstBrand>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<CustFavrateRstBrand>	 
	 deleteCustFavrateRstBrand(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<CustFavrateRstBrand>(HttpStatus.OK);
	 }
}

