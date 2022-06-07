package StringPrograms;

import java.util.Arrays;

public class CheckingAnagrams_Sentence {

    public static void main(String[] args) {

        String s1 = "He is Silent";
        String s2 = "Is he Listen";

        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        Boolean result = Arrays.equals(a, b);

        if (result == true) {
            System.out.println("Sentences are anagrams");
        } else {
            System.out.println("Sentences are not anagrams");
        }
    }

}
