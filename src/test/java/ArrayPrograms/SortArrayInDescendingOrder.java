package ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayInDescendingOrder {

    public static void main(String[] args) {

        Integer[] a = { 10, 9, 13, 11, 7, 8 };
        
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
     
    }

}
