package ExceptionHandling;

public class InsufficientBalanceException extends RuntimeException {
	
	public String toString() {
		return "Insufficient Balance exception";
	}

	public static void main(String[] args) {
		Amount a1 = new Amount(5000);
		try {
			a1.withdraw(10000);
		}
		catch(InsufficientBalanceException i) {
			//i.printStackTrace();
			System.out.println(i);
		}
	}
}
