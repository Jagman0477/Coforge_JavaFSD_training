import java.util.Objects;

public class WaterBottle {
	
	private int id;
	private String model;
	
	public WaterBottle(int id, String model) {
		super();
		this.id = id;
		this.model = model;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, model);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WaterBottle other = (WaterBottle) obj;
		return id == other.id && Objects.equals(model, other.model);
	}
	
	public static void main(String[] args) {
		
		WaterBottle wb1 = new WaterBottle(872, "PlasticPlopper");
		WaterBottle wb2 = new WaterBottle(872, "PlasticPlopper");
		
		System.out.println(wb1.equals(wb2));
		System.out.println((wb1.hashCode()) == (wb2.hashCode()));
		
	}
	
}
