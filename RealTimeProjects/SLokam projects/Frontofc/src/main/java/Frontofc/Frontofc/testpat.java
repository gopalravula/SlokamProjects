package Frontofc.Frontofc;

import java.lang.module.ResolutionException;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class testpat {
	
	
	public static void main(String[] args) {
		
		RestTemplate rst = new RestTemplate();
		String url = "http://localhost:8080/doctor/getbyid/1";		
		
		ResponseEntity<doctorDto>	 data =	rst.getForEntity(url, doctorDto.class);
	
		doctorDto df = data.getBody();
	
	System.out.println(df);
	System.out.println(data.getStatusCode());
	System.out.println(data.getBody());
	System.out.println(data.getHeaders());
	
	
	}
	

	public static void main1(String[] args) {
		
		
		doctorDto ddto = new doctorDto();
		ddto.setDid(3);
		ddto.setDname("laxmi");
		ddto.setDfee(345345.56);
		ddto.setDopintment("open");
		ddto.setDspec("heart");
		ddto.setDexp(6);
		ddto.setDstudy("FRS");
		
		
		
		//header body 
		
		RestTemplate rst = new RestTemplate();
		String url = "http://localhost:8080/doctor/saved";
		//doctorDto data =	rst.postForObject(url, ddto, doctorDto.class);
	//	System.out.println(data);
		
		
	ResponseEntity<doctorDto> data =	rst.postForEntity(url, ddto, doctorDto.class);

	System.out.println(data.getHeaders());
	System.out.println(data.getBody());
	System.out.println(data.getStatusCode());
	
	

	
	}

}
