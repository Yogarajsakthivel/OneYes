package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Estimate;
import com.example.demo.payload.EstimatePayload;

public interface EstimateService {

	List < Estimate> findAll();
	
	void addEstimate(Estimate estimate);
	
	Estimate calculate (EstimatePayload estimatepayload);
}
