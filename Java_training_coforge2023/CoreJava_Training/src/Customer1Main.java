
public class Customer1Main {

	public static void main(String[] args) {
		
		Customer1 c1 = new Customer1(12324, "Madhav Sharma", "madh.sharma@gmail.com");
		SavingsAccount1 sa1 = new SavingsAccount1(64980, c1, 12000d, 2000d);		
		
		System.out.println("Customer information: ");
		System.out.println("\tCustomer ID: "+c1.getCustomerId());
		System.out.println("\tCustomer name: "+c1.getCustomerName());
		System.out.println("\tCustomer email: "+c1.getCustomerEmail());
		
		System.out.println("Account details: ");
		System.out.println("\tAccount number: "+ sa1.accountNumber);
		System.out.println("\tAccount balance: "+ sa1.balance);
		System.out.println("\tAccount minimum balance: "+ sa1.minBalance);
		
		if(sa1.withdraw(2000))
			System.out.println("Money withdrawl successful");
		else 
			System.out.println("Insufficient minimum balance");
		if(sa1.withdraw(8000)) {
			System.out.println("Account withdrawn ");
		System.out.println("Account information ");
		System.out.println("\tAccountNumber\tBalance\tMinimum Balance");
		System.out.println("\t"+sa1.accountNumber+"\t\t"+sa1.balance+"\t"+sa1.minBalance);
		}
		else 
			System.out.println("Insufficient minimum balance");
		
	}
	
}
