package ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsUsingSet {
    public static void main(String[] args) {
        int[] givenArray = { 10, 20, 22, 25, 24, 20, 100, 24,110, 100, 125 };
        Set<Integer> s1 = new HashSet<Integer>();

        for (int i : givenArray) {
            if (!s1.add(i)) {
                System.out.println("Duplicate element is: " + i);
            }
        }
    }

}
