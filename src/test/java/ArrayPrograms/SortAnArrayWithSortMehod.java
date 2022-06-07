package ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortAnArrayWithSortMehod {

    public static void main(String[] args) {

        Integer[] a = { 10, 9, 13, 11, 7, 8 };

        Arrays.sort(a);
        //Arrays.sort(a, 0, a.length / 2);

        System.out.println(Arrays.toString(a));

    }

}
