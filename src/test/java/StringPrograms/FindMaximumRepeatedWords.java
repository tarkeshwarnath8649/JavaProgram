package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindMaximumRepeatedWords {

    public static void main(String[] args) {

        String s1 = "ram sia ram jai ram jai jai ram";

        String[] s2 = s1.split(" ");

        LinkedHashMap<String, Integer> map1 = new LinkedHashMap<String, Integer>();

        for (String s : s2) {
            if (map1.containsKey(s)) {
                map1.put(s, map1.get(s) + 1);
            } else {
                map1.put(s, 1);
            }
        }
        
        String maxKey = "";
        int maxValue =0;
        
        for(Map.Entry<String, Integer> entry : map1.entrySet()){
            
            if(entry.getValue()>maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<String, Integer>();
        
        map2.put(maxKey, maxValue);
        System.out.println(map2);
        
    }

}
