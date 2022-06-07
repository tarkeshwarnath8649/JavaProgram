package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FindOccurancesOfDuplicateCharacters {

    public static void getDuplicateChar(String s) {

        ConcurrentHashMap<Character, Integer> duplicateChar = new ConcurrentHashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (duplicateChar.containsKey(s.charAt(i))) {
                duplicateChar.put(s.charAt(i), duplicateChar.get(s.charAt(i)) + 1);
            } else {
                duplicateChar.put(s.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : duplicateChar.entrySet()) {
            if (entry.getValue() == 1) {
                duplicateChar.remove(entry.getKey());
            }
        }
        System.out.println(duplicateChar);

    }

    public static void main(String[] args) {
        getDuplicateChar("Selenium");
    }

}
