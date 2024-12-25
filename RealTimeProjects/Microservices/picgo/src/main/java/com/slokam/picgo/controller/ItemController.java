package com.slokam.picgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picgo.entity.Item;
import com.slokam.picgo.service.ItemService;

@RestController
@RequestMapping("Item") 
public class ItemController {
	 @Autowired
	 private ItemService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Item>	 saveItem(@RequestBody Item obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Item>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Item>	 deleteItem(@RequestBody Item obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Item>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Item>> getAllItem(){
		 List<Item> list = service.getAll();
		 return new ResponseEntity<List<Item>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Item> getByIdItem(@PathVariable Integer id) {
		  Item obj =  service.getById(id);
		  return new ResponseEntity<Item>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<Item>	 
	 deleteItem(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Item>(HttpStatus.OK);
	 }
}

