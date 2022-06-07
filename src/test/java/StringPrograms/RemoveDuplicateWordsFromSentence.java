package StringPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsFromSentence {

    public static void main(String[] args) {
        String s1 = "This was a test program was was program to ";

        String[] s2 = s1.split(" ");

        LinkedHashSet<String> set1 = new LinkedHashSet<String>();

        for (String s : s2) {
            set1.add(s);
        }
        for (String s4 : set1) {
            System.out.print(s4 + " ");
        }
    }

}
