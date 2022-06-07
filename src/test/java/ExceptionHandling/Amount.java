package ExceptionHandling;

public class Amount {
	
	int bal;
	
	public Amount(int bal) {
		this.bal = bal;
	}
	
	public void withdraw(int amount) {
		if(amount < bal) {
			System.out.println("Withdrawl successful");
		}
		else {
			throw new InsufficientBalanceException();
		}
	}

}
