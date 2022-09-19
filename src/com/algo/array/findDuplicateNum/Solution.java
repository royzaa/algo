package com.algo.array.findDuplicateNum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if(hashMap.containsKey(nums[i])) {
                return nums[i];
            }
            hashMap.put(nums[i], nums[i]);
        }
        return -1;
    }
}
