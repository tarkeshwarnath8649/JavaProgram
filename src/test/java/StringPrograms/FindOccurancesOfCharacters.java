package StringPrograms;

import java.util.LinkedHashMap;

public class FindOccurancesOfCharacters {

    public static void main(String[] args) {
        String s1 = "Tatanagar";

        LinkedHashMap<Character, Integer> countCharacter = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < s1.length(); i++) {
            if (countCharacter.containsKey(s1.charAt(i))) {
                countCharacter.put(s1.charAt(i), countCharacter.get(s1.charAt(i)) + 1);
            } else {
                countCharacter.put(s1.charAt(i), 1);
            }
        }
        System.out.println(countCharacter);

    }

}
