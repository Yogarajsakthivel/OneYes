package com.example.demo.serviceimpl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.demo.model.Estimate;
import com.example.demo.payload.EstimatePayload;
import com.example.demo.repository.EstimateRepository;
import com.example.demo.service.EstimateService;
@Service
public class EstimateServiceImpl  implements EstimateService{

	 private final EstimateRepository estimateRepository;

	    public EstimateServiceImpl(EstimateRepository estimateRepository) {
	        this.estimateRepository = estimateRepository;
	    }

	    @Override
	    
	    public List<Estimate> findAll() 
	    
	    {
	        return estimateRepository.findAll();
	    }

		@Override
		
		public void addEstimate(Estimate estimate) {
			
			 estimateRepository.save(estimate);
			
		}
		

		@Override
		public Estimate calculate(EstimatePayload epay) {

		    int oneSqttiles = 1;
		    int tilesRate = 130;
		    int Sync = 3000;
		    int Light = 250;
		    int Cement = 4500;
		    int Steel = 6000;
		    int Pipe = 2500;
		    int Wiring = 1000;
		    int Switch = 800;

		   Estimate estimate = new Estimate();
		   
		    int totalKitchenTiles = oneSqttiles * epay.k_sqt;

		    int totalKitchenTilesRate = totalKitchenTiles * tilesRate;

		    estimate.Kitchen_Expense = totalKitchenTilesRate + Sync +  Light + Cement +Steel +Pipe + Wiring + Switch;

		    

		    int totalBedroomTiles = oneSqttiles * epay.b_sqt;

		    int totalBedroomTilesRate = totalBedroomTiles * tilesRate;

		    estimate.Bedroom_Expense =  totalBedroomTilesRate +2* Light + Cement + Steel + Wiring;

		  

		    int totalWashroomTiles = oneSqttiles * epay.w_sqt;

		    int totalWashroomTilesRate = totalWashroomTiles * tilesRate;

		    estimate.Washroom_Expense =totalWashroomTilesRate + Sync + Light + Cement + Steel + Wiring;


		    int totalHallTiles = oneSqttiles * epay.h_sqt;

		    int totalHallTilesRate = totalHallTiles * tilesRate;

		    estimate.Hall_Expense =  totalHallTilesRate + Sync +3*Light + Cement + Steel + Wiring;
		 
		     
		    estimate.Total_Expense = estimate.Kitchen_Expense + estimate.Bedroom_Expense + 
		    		  
		    		                                   estimate.Washroom_Expense + estimate.Hall_Expense;
		    
		    addEstimate(estimate);
		
		
		return estimate;
		
		
		}


		
}
