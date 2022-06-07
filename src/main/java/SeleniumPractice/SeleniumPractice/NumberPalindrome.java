package SeleniumPractice.SeleniumPractice;

public class NumberPalindrome {

	public static void main(String[] args) {

		int n = -121;
		int temp = n;
		int n1 = 0;

		while (n != 0) {
			int digit = n % 10;
			n1 = n1 * 10 + digit;
			n = n / 10;
		}

		System.out.println(n1);

		if (temp == n1) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
