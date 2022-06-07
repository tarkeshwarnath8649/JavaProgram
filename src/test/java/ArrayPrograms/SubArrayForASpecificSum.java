package ArrayPrograms;

public class SubArrayForASpecificSum {

    public static void printsubArrays(int givenArray[], int sum) {
        int arrayLength = givenArray.length;

        for (int i = 0; i < arrayLength; i++) {
            int firstArray = givenArray[i];

            for (int j = i + 1; j < arrayLength; j++) {
                int secondArray = givenArray[j];

                if ((firstArray + secondArray) == sum) {

                    System.out.println("(" + firstArray + ", " + secondArray + ")");
                }
            }
        }

    }
    
    public static void main(String[] args) {
        
        int givenArray[] = {1,2,5,5,6,3,8};
        int sum = 10;
        
        printsubArrays(givenArray, sum);
        
    }
    

}
