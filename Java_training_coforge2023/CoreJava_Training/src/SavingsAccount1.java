
public class SavingsAccount1 extends Account1{
	
	public double minBalance;
	
	public SavingsAccount1(int accountNumber, Customer1 custObj, double balance, double minBalance) {
		super(accountNumber, custObj, balance);
		this.minBalance = minBalance;
	}

	@Override
	public boolean withdraw(double amt) {
		
		if(balance-amt >= minBalance) {
			balance -= minBalance;
			return true;
		}
		
		return false;
	}
	
}
