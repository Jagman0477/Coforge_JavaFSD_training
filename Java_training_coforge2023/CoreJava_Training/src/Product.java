public class Product {
	
	private long prdId;
	private String prdName;
	private float prdCost;
	private int prdCount;
	
	private Order order;
	
	public Product(long prdId, String prdName, float prdCost, int prdCount, Order order) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCost = prdCost;
		this.prdCount = prdCount;
		this.order = order;
	}
	
	public long getPrdId() {
		return prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public float getPrdCost() {
		return prdCost;
	}
	public int getPrdCount() {
		return prdCount;
	}
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	void productDetails() {
		System.out.println("Product details: ");
		System.out.println("\tProduct ID: "+getPrdId());
		System.out.println("\tProduct name: "+getPrdName());
		System.out.println("\tProduct cost: "+getPrdCost());
		System.out.println("\tProduct count: "+getPrdCount());
		
		System.out.println("\nOrder detials: ");
		Order o1 = getOrder();
		System.out.println("\tOrder ID: "+o1.getOrderId());
		System.out.println("\tOrder location: "+o1.getOrderLocation());
		System.out.println("\tOrder total cost: "+o1.getOrderTotalCost());
	}
	

}