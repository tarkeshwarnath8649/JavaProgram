package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaximumRepetedCharactersInAString {

    public static void main(String[] args) {

        String s1 = "malayalam";

        LinkedHashMap<Character, Integer> map1 = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch) + 1);
            } else {
                map1.put(ch, 1);
            }
        }
        int maxValue = 0;
        char maxKey = ' ';
        LinkedHashMap<Character, Integer> map2 = new LinkedHashMap<Character, Integer>();

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {

            if (entry.getValue() > maxValue) {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        // System.out.println(maxKey);
        // System.out.println(maxValue);
        map2.put(maxKey, maxValue);
        System.out.println(map2);

    }

}
