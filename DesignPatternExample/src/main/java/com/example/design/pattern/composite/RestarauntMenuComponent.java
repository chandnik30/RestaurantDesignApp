package com.example.design.pattern.composite;

public abstract class RestarauntMenuComponent {
   
	public void add(RestarauntMenuComponent restarauntMenuComponent) {
		throw new UnsupportedOperationException();
	}
	public void remove(RestarauntMenuComponent restarauntMenuComponent) {
		throw new UnsupportedOperationException();
	}
	public RestarauntMenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
  
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
  
	public void print() {
		throw new UnsupportedOperationException();
	}
}
