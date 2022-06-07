package StringPrograms;

public class ReverseAlternateXCharactersInAString {

    public static void main(String[] args) {

        String input = "abcdefghijklmno";
        int len = input.length();
        int k = 4;
        StringBuffer output = revAlternate(input, k, len);
        System.out.println(output);
    }

        private static StringBuffer revAlternate(String input, int k, int len) {
            StringBuffer rev = new StringBuffer(input);
            for (int i = 0; i < input.length();) {

                // If there are less than k characters
                // starting from the current position
                if (i + k > len) {
                    break;
                }

                String subString = input.substring(i, i + k);
                StringBuffer revString = new StringBuffer(subString).reverse();  // Reverse first k characters
                rev.replace(i, i+k, revString.toString()); //After reverse , replace the reverse substring from the main input String
                
                i = i + 2 * k; // Skip the next k characters
            }
            return rev;
        }

    

}
