package ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortSingleArrayInAcsendingAndDescendingOrder {

    public static void main(String[] args) {

        int a[] = { 10, 9, 6, 20, 30, 25, 15, 1, 11, 4 };

        int[] b = new int[a.length / 2];
        int k = 0;

        for (int i = 0; i < a.length / 2; i++) {
            b[k++] = a[i];
        }

        Integer[] c = new Integer[a.length / 2];
        int l = 0;

        for (int j = a.length / 2; j < a.length; j++) {
            c[l++] = a[j];
        }

        Arrays.sort(b);
        Arrays.sort(c, Collections.reverseOrder());

        int[] finalArray = new int[b.length + c.length];
        int z = 0;
        for (int g : b) {
            finalArray[z++] = g;
        }
        for (int f : c) {
            finalArray[z++] = f;
        }

        for (int i : finalArray) {
            System.out.println(i);
        }
    }

}
