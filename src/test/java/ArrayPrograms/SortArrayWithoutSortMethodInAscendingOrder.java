package ArrayPrograms;

import java.util.Arrays;

public class SortArrayWithoutSortMethodInAscendingOrder{

    public static void main(String[] args) {
        int[] a = { 10, 9, 13, 11, 7, 8 };
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
