package com.example.design.pattern.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends RestarauntMenuComponent {
	ArrayList<RestarauntMenuComponent> restarauntMenuComponents = new ArrayList<RestarauntMenuComponent>();
	String name;
	String description;
  
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
 
	public void add(RestarauntMenuComponent restarauntMenuComponent) {
		restarauntMenuComponents.add(restarauntMenuComponent);
	}
 
	public void remove(RestarauntMenuComponent restarauntMenuComponent) {
		restarauntMenuComponents.remove(restarauntMenuComponent);
	}
 
	public RestarauntMenuComponent getChild(int i) {
		return (RestarauntMenuComponent) restarauntMenuComponents.get(i);
	}
 
	public String getName() {
		return name;
	}
 
	public String getDescription() {
		return description;
	}
 
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
  
		Iterator<RestarauntMenuComponent> iterator = restarauntMenuComponents.iterator();
		while (iterator.hasNext()) {
			RestarauntMenuComponent restarauntMenuComponent =
				(RestarauntMenuComponent)iterator.next();
			restarauntMenuComponent.print();
		}
	}
}
