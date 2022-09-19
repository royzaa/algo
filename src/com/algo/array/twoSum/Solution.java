package com.algo.array.twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    // return two indices of the values that the sum is equal to target
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                 output[0] = map.get(complement);
                 output[1] = i;
                return output;
            }
            map.put(nums[i], i);
        }
        throw new ArrayStoreException();
    }
}
