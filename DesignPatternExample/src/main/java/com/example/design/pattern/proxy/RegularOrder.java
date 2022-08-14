package com.example.design.pattern.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * The object to be proxyed.
 * 
 */
public class RegularOrder implements RestaurantOrder {

	private List<String> listOfOrders;

	public RegularOrder() {
		listOfOrders = new ArrayList<>();
	}

	@Override
	public int totalOrders() {
		return listOfOrders.size() + 1;
	}

	@Override
	public void registerOrder(String name) {
		listOfOrders.add(name);
		System.out.println(" order number : " + name);
	}
}
