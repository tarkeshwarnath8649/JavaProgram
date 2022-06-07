package StringPrograms;

public class RemoveMultipleSpacesFromSentence {

    public static void main(String[] args) {
       String s1 = "      This is    a          test  program          ";
       String s2 = s1.trim().replaceAll(" +", " ");
       System.out.println(s2);

    }

}
