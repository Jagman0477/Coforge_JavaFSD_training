public class Order {
	
	private int orderId;
	private String orderLocation;
	private float orderTotalCost;
	
	public float getOrderTotalCost() {
		return orderTotalCost;
	}
	public void setOrderTotalCost(float orderTotalCost) {
		this.orderTotalCost = orderTotalCost;
	}
	public int getOrderId() {
		return orderId;
	}
	public String getOrderLocation() {
		return orderLocation;
	}
	
	public Order(int orderId, String orderLocation, float orderCost) {
		super();
		this.orderId = orderId;
		this.orderLocation = orderLocation;
		this.orderTotalCost = orderTotalCost;
	}
	
	

}