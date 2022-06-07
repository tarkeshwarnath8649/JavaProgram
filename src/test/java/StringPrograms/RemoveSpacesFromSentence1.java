package StringPrograms;

public class RemoveSpacesFromSentence1 {

    public static void main(String[] args) {
        String s1 = "Java is essential for learning Selenium";
        String s2 = "";
        
        for(int i = 0;i<s1.length();i++){
            char ch = s1.charAt(i);
            String s3 = Character.toString(ch);
            if(!s3.equals(" ")){
                s2+=ch;
            }
                
            }
        System.out.println(s2);
        }

    }


