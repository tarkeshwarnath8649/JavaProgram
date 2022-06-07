package StringPrograms;

public class ReverseMiddleXCharacters {

    public static void reverserMiddle(String s, int x) {

        // x is the no of middle characters that has to be reversed
        // e.g given string is "geeksforgeeks" and middle 3 characters have to be reversed
        // output = geeksrofgeeks

        int strLen = s.length();
        int n = (strLen - x) / 2; // Count of characters that we dont have to reverse from the begining

        // Print the first n characters without reverse

        for (int i = 0; i < n; i++) {
            System.out.print(s.charAt(i));
        }
        
        //Print middle X characters in reverse
        
        for (int i = n + x - 1; i >= n; i--) {
            System.out.print(s.charAt(i));
        }
        
        //Print last no characters
        
        for (int i = n + x; i < strLen; i++) {
            System.out.print(s.charAt(i));
        }

    }

    public static void main(String[] args) {
        reverserMiddle("geeksforgeeks", 3);

    }

}
