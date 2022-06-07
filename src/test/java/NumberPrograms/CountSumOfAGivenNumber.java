package NumberPrograms;

public class CountSumOfAGivenNumber {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        
        int arrayLength = a.length;;
        
        int sum = arrayLength* (arrayLength+1)/2;
        System.out.println(sum);
        
        //Formula to find the sum of given numbers is : n * (n+1) /2 
        //where n is the numbers of digits in the given number
        //In case of array, we consider length of array as n
        

}
}