package StringPrograms;

public class FindMiddleXCharacters {

    public static void findMiddleCharacters(String s, int x) {

        // x = number of middle characters needs to be printed in reverse order
        // n = Count of characters that we dont have to reverse from the begining

        int n = (s.length() - x) / 2;
        for (int i = n; i < n + x; i++) {
            System.out.print(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        findMiddleCharacters("abcdefgh", 2);
    }

}
