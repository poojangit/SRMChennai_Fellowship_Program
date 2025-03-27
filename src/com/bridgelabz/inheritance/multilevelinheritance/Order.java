package com.bridgelabz.inheritance.multilevelinheritance;

//Base class - Order
public class Order {
	// declaring the attributes for base class
	protected int orderId;
	protected String date;
	// constructor for initializing the base class attributes
	public Order(int orderId, String date) {
		this.orderId = orderId;
		this.date = date;
	}
	// method for getting the order status
	public String getOrderStatus() {
		return "Order Placed";
	}
}
// Subclass - ShippedOrder 
class ShippedOrder extends Order {
	// additional attributes for shipped order class
	protected String trackingNumber;
	// constructor
	public ShippedOrder(int orderId, String date, String trackingNumber) {
		super(orderId, date);
		this.trackingNumber = trackingNumber;
	}
	// override the method
	@Override
	public String getOrderStatus() {
		return "Order Shipped(Tracking No: " + trackingNumber + ")";
	}
}
// subclass delivered order with extends shipped order by implementing a multilevel order
class DeliveredOrder extends ShippedOrder{
	// attributes 
	protected String deliveryDate;
	// constructors for initializing
	public DeliveredOrder(int orderId, String date, String trackingNumber, String deliveryDate) {
		super(orderId, date, trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	// Override methods
	@Override
	public String getOrderStatus() {
		return "Order Delivered on : " + deliveryDate;
	}
}