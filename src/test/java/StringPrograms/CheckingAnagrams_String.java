package StringPrograms;

import java.util.Arrays;

public class CheckingAnagrams_String {

    public static void main(String[] args) {

        String s1  = "silent";
        String s2 = "listen";
        
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        Boolean result = Arrays.equals(a, b);
        
        if(result == true){
            System.out.println("Strings are anagrams");
        }else{
            System.out.println("Strings are not anagrams");
        }
    }

}
