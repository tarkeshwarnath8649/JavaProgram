package ArrayPrograms;

public class FindDuplicateElementsUsingLoop {

    public static void main(String[] args) {

        int[] givenArray = { 10, 20, 22, 25, 24, 20, 100, 110, 100, 125 };

        int len = givenArray.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {

                if (givenArray[i] == givenArray[j])
                    System.out.println("Duplicate elements are: " + givenArray[i]);
            }
        }
    }

}
