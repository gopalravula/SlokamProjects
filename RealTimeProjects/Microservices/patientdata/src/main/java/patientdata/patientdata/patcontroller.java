package patientdata.patientdata;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class patcontroller {

	@GetMapping("getpdata")
	public String getpdetails()
	{
		
		return "patient reg info will be displayed";
		
	}
}
