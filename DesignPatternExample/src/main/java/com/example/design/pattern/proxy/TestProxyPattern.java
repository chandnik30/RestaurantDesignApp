package com.example.design.pattern.proxy;

public class TestProxyPattern {

	public static void main(String[] args) {

		RestaurantOrder RegularOrder = new RegularOrder();
		RestaurantOrder proxyBatch = new ProxyOrderBatch(RegularOrder);
		proxyBatch.registerOrder(" Order number 1");
		proxyBatch.registerOrder(" Order number 2");
		proxyBatch.registerOrder(" Order number 3");
		proxyBatch.registerOrder(" Order number 4");
		proxyBatch.registerOrder(" Order number 5");
		proxyBatch.registerOrder(" Order number 6");
		proxyBatch.registerOrder(" Order number 7");
		proxyBatch.registerOrder(" Order number 8");
		proxyBatch.registerOrder(" Order number 9");
		proxyBatch.registerOrder(" Order number 10");
		proxyBatch.registerOrder(" Order number 11");
		proxyBatch.registerOrder(" Order number 12");
		proxyBatch.registerOrder(" Order number 13");
	}

}