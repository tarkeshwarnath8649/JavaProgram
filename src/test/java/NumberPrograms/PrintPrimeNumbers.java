package NumberPrograms;

public class PrintPrimeNumbers {

	public static void isPrime() {

		for (int no = 2; no < 100; no++) {
			int count = 0;
			for (int i = 2; i < no; i++) {

				if (no % i == 0) {
					count++;
				}

			}
			if (count == 0) {
				System.out.print(no + " ");
			}
		}

	}

	public static void main(String[] args) {
		isPrime();

	}

}
