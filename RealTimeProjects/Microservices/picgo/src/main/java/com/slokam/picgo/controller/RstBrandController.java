package com.slokam.picgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picgo.entity.RstBrand;
import com.slokam.picgo.service.RstBrandService;

@RestController
@RequestMapping("RstBrand") 
public class RstBrandController {
	 @Autowired
	 private RstBrandService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<RstBrand>	 saveRstBrand(@RequestBody RstBrand obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<RstBrand>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<RstBrand>	 deleteRstBrand(@RequestBody RstBrand obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<RstBrand>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<RstBrand>> getAllRstBrand(){
		 List<RstBrand> list = service.getAll();
		 return new ResponseEntity<List<RstBrand>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<RstBrand> getByIdRstBrand(@PathVariable Integer id) {
		  RstBrand obj =  service.getById(id);
		  return new ResponseEntity<RstBrand>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<RstBrand>	 
	 deleteRstBrand(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<RstBrand>(HttpStatus.OK);
	 }
}

