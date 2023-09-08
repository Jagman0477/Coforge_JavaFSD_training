
public abstract class Account1 {

	protected int accountNumber;
	protected Customer1 custObj;
	protected double balance;
	
	public Account1() {
		
	}
	
	protected Account1(int accountNumber, Customer1 custObj, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.custObj = custObj;
		this.balance = balance;
	}
	
	abstract public boolean withdraw(double amt);
	
}
