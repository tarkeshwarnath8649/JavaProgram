package ArrayPrograms;

import java.util.Arrays;

public class SortArrayWithAll0And1 {

    public static void main(String[] args) {

        int[] a = { 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0 };
        int temp = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
 
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
