
public class ProductMain {

	public static void main(String[] args) {
		
		Order o1 = new Order(120016, "Ghaziabad", 0);
		
		Product p1 = new Product(201, "TVS Jupiter", 70000, 2, o1);
		o1.setOrderTotalCost(p1.getPrdCost()*p1.getPrdCount());
		
		p1.productDetails();
		
	}
	
}
