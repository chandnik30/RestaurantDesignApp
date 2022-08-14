package com.example.design.pattern.proxy;

/**
 * The proxy class controlling access to the CourseBatch.
 *
 */
public class ProxyOrderBatch implements RestaurantOrder {

	private RestaurantOrder order;
	private static final int TOTAL_ORDERS_ALLOWED_TO_BATCH = 10;

	public ProxyOrderBatch(RestaurantOrder order) {
		this.order = order;
	}

	@Override
	public int totalOrders() {
		return order.totalOrders();
	}

	@Override
	public void registerOrder(String number) {
		if (TOTAL_ORDERS_ALLOWED_TO_BATCH >= this.totalOrders()) {
			order.registerOrder(number);
		} else {
			System.out.println("Order batch size is : " + TOTAL_ORDERS_ALLOWED_TO_BATCH);
			System.out.println("Order Batch is full so further orders are not allowed ");
		}
	}

}