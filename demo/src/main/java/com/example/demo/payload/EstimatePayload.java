package com.example.demo.payload;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "estimatecost")

public class EstimatePayload {

	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
	public  int id;
	public int k_sqt;
	public int b_sqt;
	public int w_sqt;
	public int h_sqt;
	
}
