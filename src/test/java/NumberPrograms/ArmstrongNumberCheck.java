package NumberPrograms;

public class ArmstrongNumberCheck {

	public static void armstrongNumberCheck(int n) {
		int temp = n;
		int sum = 0;

		while (n != 0) {
			int d = n % 10;
			n = n / 10;
			sum += d * d * d;
		}
		if (sum == temp) {
			System.out.println(temp + " is an Armstrong number");
		} else {
			System.out.println(temp + " is not an Armstrong number");

		}
	}

	public static void main(String[] args) {

		armstrongNumberCheck(371);
	}

}
