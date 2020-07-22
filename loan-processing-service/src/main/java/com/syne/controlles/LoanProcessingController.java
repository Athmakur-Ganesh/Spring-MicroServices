package com.syne.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.Setter;

@RestController
@CrossOrigin(origins="*")
@Setter
public class LoanProcessingController {
 
	@Autowired
	private RestTemplate template;
	
	private String baseUrl = "http://CIBLI-SCORE-SERVICE/api/v1/scores" ;
	
	@GetMapping(path = "/api/v1/cibilScores",produces="application/json")
	public String findCibilScore() {
		return template.getForObject(baseUrl, String.class);
	}
}
