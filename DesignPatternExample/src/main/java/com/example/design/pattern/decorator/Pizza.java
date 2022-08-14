package com.example.design.pattern.decorator;

public abstract class Pizza {
	String description = "Basic Pizza";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
