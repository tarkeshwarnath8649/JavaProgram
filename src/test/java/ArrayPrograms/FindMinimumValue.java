package ArrayPrograms;

public class FindMinimumValue {

    public static void main(String[] args) {
        int[] givenArray = { 10,10,9,9, 20, 22, 25, 24, 20, 100, 110, 100, 125 };

        int min = givenArray[0];
        for (int i : givenArray) {
            if (i < min) {
                min = i;
            }
        }
        
        System.out.println("Minimum value is: "+min);
    }

}
