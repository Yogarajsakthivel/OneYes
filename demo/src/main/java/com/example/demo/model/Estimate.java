package com.example.demo.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estimatecost")
public class Estimate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    public int id; 
    public int Kitchen_Expense;
    public int Bedroom_Expense;
    public int Washroom_Expense;
    public int Hall_Expense;
    public int Total_Expense;
   
	
    
	

}