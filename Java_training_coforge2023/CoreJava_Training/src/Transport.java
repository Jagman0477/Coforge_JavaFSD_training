
public class Transport {

	private int transportId;
	private String transportName;
	private String transportRoute;
	
	public Transport(int transportId, String transportName, String transportRoute) {
		super();
		this.transportId = transportId;
		this.transportName = transportName;
		this.transportRoute = transportRoute;
	}
	
	@Override // Overriding the main base class(Object class in java) method toString()
	public String toString() {
		return "Transport information: "+
				"\n\tTransport ID = "+getTransportId()+
				"\n\tTransport name = "+getTransportName()+
				"\n\tTransport route = "+getTransportRoute();			
	}

	public int getTransportId() {
		return transportId;
	}

	public void setTransportId(int transportId) {
		this.transportId = transportId;
	}

	public String getTransportName() {
		return transportName;
	}

	public void setTransportName(String transportName) {
		this.transportName = transportName;
	}

	public String getTransportRoute() {
		return transportRoute;
	}

	public void setTransportRoute(String transportRoute) {
		this.transportRoute = transportRoute;
	}
	
	
	
}
