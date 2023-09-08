
public class Associate {

	private int associateId;
	private String associateName;
	private String workStatus;
	private int daysWorking;

	public Associate(int associateId, String associateName, int daysWorking) {
		super();
		this.associateId = associateId;
		this.associateName = associateName;
		this.daysWorking = daysWorking;
		trackAssociateStatus(daysWorking);
	}
	
	public int getDaysWorking() {
		return daysWorking;
	}
	public void setDaysWorking(int daysWorking) {
		this.daysWorking = daysWorking;
	}
	public int getAssociateId() {
		return associateId;
	}
	public String getAssociateName() {
		return associateName;
	}
	public String getWorkStatus() {
		return workStatus;
	}
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
	
	public void trackAssociateStatus(int daysWorking){
		if(daysWorking<=20)
			setWorkStatus("Core Skills");
		else if(daysWorking<=40)
			setWorkStatus("Advanced modules");
		else if(daysWorking<=60)
			setWorkStatus("Project phase");
		else 
			setWorkStatus("Deployed to project");
	}
	
}
