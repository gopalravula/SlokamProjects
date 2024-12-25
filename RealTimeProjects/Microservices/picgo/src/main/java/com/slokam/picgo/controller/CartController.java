package com.slokam.picgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picgo.entity.Cart;
import com.slokam.picgo.service.CartService;

@RestController
@RequestMapping("Cart") 
public class CartController {
	 @Autowired
	 private CartService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Cart>	 saveCart(@RequestBody Cart obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Cart>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Cart>	 deleteCart(@RequestBody Cart obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Cart>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Cart>> getAllCart(){
		 List<Cart> list = service.getAll();
		 return new ResponseEntity<List<Cart>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Cart> getByIdCart(@PathVariable Integer id) {
		  Cart obj =  service.getById(id);
		  return new ResponseEntity<Cart>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<Cart>	 
	 deleteCart(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Cart>(HttpStatus.OK);
	 }
}

