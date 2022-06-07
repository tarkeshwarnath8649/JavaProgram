package NumberPrograms;

public class PrimeNumberCheck {

    public static boolean isPrime(int no) {
        int count = 0;
        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                count++;
            }

        }
        if (count == 0)
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
}
