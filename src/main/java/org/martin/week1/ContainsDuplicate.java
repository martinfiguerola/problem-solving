package org.martin.week1;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    // [1, 2, 3, 1]

    public static boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int x = i + 1; x < nums.length; x++) {
                if (nums[i] == nums[x]) return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicateOptimized(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int element : nums) {
            if (set.contains(element)) return true;
            set.add(element);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] {1, 2, 3, 4}));
    }
}
