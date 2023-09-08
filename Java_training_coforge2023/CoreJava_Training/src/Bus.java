
public class Bus {

	private long busId;
	private String busName;
	private String busRoute;
	private float busFare;
	
	
	
	public void setBusId(long busId) {
		this.busId = busId;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public void setBusRoute(String busRoute) {
		this.busRoute = busRoute;
	}

	public void setBusFare(float busFare) {
		this.busFare = busFare;
	}

	public Bus(long busId, String busName, String busRoute, float busFare) {
		this.busId = busId;
		this.busName = busName;
		this.busRoute = busRoute;
		this.busFare = busFare;
	}
	
	public long getBusId() {
		return busId;
	}
	public String getBusName() {
		return busName;
	}
	public String getBusRoute() {
		return busRoute;
	}
	public float getBusFare() {
		return busFare;
	}
	
	void busInfo() {
		
		System.out.println("\n \tBus Information: ");
		System.out.println("\tBus ID: "+ getBusId());
		System.out.println("\tBus name: "+ getBusName());
		System.out.println("\tBus route: "+ getBusRoute());
		System.out.println("\tBus fare: "+getBusFare());
		
	}
	
}
