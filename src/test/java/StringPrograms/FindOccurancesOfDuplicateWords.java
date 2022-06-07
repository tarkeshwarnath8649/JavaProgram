package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FindOccurancesOfDuplicateWords {
    public static void main(String[] args) {

        String s1 = "This is a test program is is program";

        String[] s2 = s1.split(" ");

        LinkedHashMap<String, Integer> wordCount = new LinkedHashMap<String, Integer>();
        //ConcurrentHashMap<String, Integer> wordCount =  new ConcurrentHashMap<String, Integer>();

        for (int i = 0; i < s2.length; i++) {
            if (wordCount.containsKey(s2[i])) {
                wordCount.put(s2[i], wordCount.get(s2[i]) + 1);
            } else {
                wordCount.put(s2[i], 1);
            }

        }
        System.out.println(wordCount);
        
        LinkedHashMap<String, Integer> wordCount2 = new LinkedHashMap<String, Integer>();
        wordCount2.putAll(wordCount);
        
         // using for-each loop for iteration over Map.entrySet() 
        for (Map.Entry<String,Integer> entry : wordCount.entrySet()) { 
           // System.out.println("Key = " + entry.getKey() +  ", Value = " + entry.getValue()); 
            if(entry.getValue() == 1){
                wordCount2.remove(entry.getKey()) ; 
            }
        }
        
        System.out.println(wordCount2);
    } 

    }


