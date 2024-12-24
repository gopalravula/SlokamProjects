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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import com.doc.dto.ApplicationProperties;
import com.doc.dto.doctorDto;
import com.doc.service.doctorserviceImp;
import java.nio.file.Path;
import java.nio.file.Paths;
import io.swagger.v3.oas.annotations.Operation;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;



@RestController
@RequestMapping("doctor")
public class doctorController {

	@Autowired
	private doctorserviceImp ser;
	  
	
	@Autowired
	private ApplicationProperties aps;
	
	// private final String FILE_DIRECTORY = "C://Users//Public//emponboardingdata";

	    @GetMapping("download/{filename}")
	    public ResponseEntity<Resource> downloadFile(@PathVariable("filename") String fileName) {
	        try {
	            // Resolve the file path
	            Path filePath = Paths.get(aps.getDownloadpath()).resolve(fileName).normalize();
	           
	            
	               
	            System.out.println("filePath--------------------"+filePath);
	            Resource resource = new UrlResource(filePath.toUri());

	            // Check if file exists and is readable
	            if (!resource.exists() || !resource.isReadable()) {
	                throw new RuntimeException("File not found: " + fileName);
	            }

	            // Return the file as a downloadable resource
	            
	        
	            return ResponseEntity.ok()
	                       .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
	                    .body(resource);
	        } catch (Exception e) {
	            throw new RuntimeException("Error occurred while downloading the file: " + fileName, e);
	        }
	    }
	
	
	
	
	
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
