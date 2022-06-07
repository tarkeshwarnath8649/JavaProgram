package StringPrograms;

public class RemoveSpacesFromSentence2 {
    public static void main(String[] args) {
        String s1= "Java is essential for learning Selenium";
        
        String[] s2 = s1.split(" ");
        String s3 = "";
        
        for(int i=0;i<s2.length;i++)
        {
            s3+=s2[i];
        }
        System.out.println(s3);
    }

}
