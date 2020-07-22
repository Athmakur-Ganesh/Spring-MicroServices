package com.syne.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syne.entity.CibilScore;
import com.syne.repository.CibilScoreRepo;

import lombok.Setter;

@RestController
@CrossOrigin(origins ="*") //from different host is called CrossOrigin
@Setter
public class CibilScoreController {
	
	@Autowired
	private CibilScoreRepo repo;
	
	@GetMapping(path = "/api/v1/scores",produces="application/json")
	public List<CibilScore> getAll(){
		return repo.findAll();
	}

}
