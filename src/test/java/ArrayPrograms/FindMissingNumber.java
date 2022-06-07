package ArrayPrograms;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] a = {1,2,3,5,6,7,8};
        
        int arrLen = a.length;
        int sum = (arrLen+1) * (arrLen+2)/2;
        System.out.println(sum);
        
        for(int i=0;i<arrLen;i++){
            sum -=a[i];
        }
        System.out.println(sum);
                
    }

}
