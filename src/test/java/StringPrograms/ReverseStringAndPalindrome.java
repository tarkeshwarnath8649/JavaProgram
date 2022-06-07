package StringPrograms;

public class ReverseStringAndPalindrome {
    public static void main(String[] args) {
        String s1 = "mom";
        String s2= "";
        
        for(int i=s1.length()-1;i>=0;i--){
            char ch = s1.charAt(i);
            s2+=ch;
        }
        if(s1.equals(s2)){
            System.out.println("Given string is a Palindrome");
        }else{
            System.out.println("Given string is not a Palindrome");
        }
    }
    
}
