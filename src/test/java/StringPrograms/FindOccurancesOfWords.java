package StringPrograms;

import java.util.LinkedHashMap;

public class FindOccurancesOfWords {

    public static void main(String[] args) {

        String s1 = "I am going to Learn Selnium to get a Automation Test Engineer Job";

        String[] s2 = s1.split(" ");

        LinkedHashMap<String, Integer> wordCount = new LinkedHashMap<String, Integer>();

        for (int i = 0; i < s2.length; i++) {
            if (wordCount.containsKey(s2[i])) {
                wordCount.put(s2[i], wordCount.get(s2[i]) + 1);
            } else {
                wordCount.put(s2[i], 1);
            }

        }
        System.out.println(wordCount);

    }

}
