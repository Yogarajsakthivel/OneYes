package com.example.demo.controller;

import java.util.List;


import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Estimate;
import com.example.demo.payload.EstimatePayload;
import com.example.demo.service.EstimateService;

@RestController

@RequestMapping("/api/estimate")


@CrossOrigin(origins = "http://localhost:3000")

public class EstimateController {

	private final EstimateService estimateService;

    
    public EstimateController(EstimateService estimateService) {
        this.estimateService = estimateService;
    }

    @GetMapping
    
    public List<Estimate> getAllEstimates() 
    {
        return estimateService.findAll();
    }
    
    
   
    @PostMapping("/calculate")
    
    public Estimate calculate (@RequestBody  EstimatePayload epay)
    
    {
    
 		return estimateService.calculate(epay);
     }
    
    
    
  
   
    
    
}
