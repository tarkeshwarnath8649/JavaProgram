package ArrayPrograms;

public class FindMaxValue {

    public static void main(String[] args) {
        int[] givenArray = { 10, 20, 22, 25, 24, 20, 100, 110, 100, 125 };

        int max = givenArray[0];

        for (int i : givenArray) {

            if (i > max) {
                max = i;
            }

        }
        
        System.out.println("Maximum value is: "+max);
    }

}
