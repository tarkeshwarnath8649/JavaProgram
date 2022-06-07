package ArrayPrograms;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] a = {10,20,30};
        int[] b = {40,50,60};
        
        int[] c = new int[a.length+b.length];
        
        int k=0;
        
        for(int i : a){
            c[k++]=i;
        }
        for(int l : b){
            c[k++]=l;
        }
        System.out.println(Arrays.toString(c));
    }

}
