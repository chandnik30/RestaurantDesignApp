package com.example.design.pattern.composite;
  
public class Waitress {
	RestarauntMenuComponent allMenus;
 
	public Waitress(RestarauntMenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
}
