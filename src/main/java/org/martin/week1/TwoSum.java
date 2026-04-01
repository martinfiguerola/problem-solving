package org.martin.week1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] indexes = twoSumOptimized(new int[] { 3, 3}, 6);

        System.out.println(Arrays.toString(indexes));
    }


    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int x = i + 1; x < nums.length; x++) {
                if (nums[i] + nums[x] == target) return new int[] {i, x};
            }

        }
        throw new IllegalArgumentException("No two sum solution found");
    }

    public static int[] twoSumOptimized(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) return new int[] {i, map.get(complement)};

            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution found");
    }

}
