package com.algo.array.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPointer {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0; i<nums.length -2;i++) {
            if (i<0 && nums[i] == nums[i-1]) continue;
            int leftPointer = i + 1;
            int rightPointer = nums.length-1;
            while (leftPointer < rightPointer) {
                int sum = nums[leftPointer] + nums[leftPointer+1] + nums[rightPointer];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[leftPointer], nums[leftPointer +1], nums[rightPointer]));
                    while (leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer+1]) leftPointer++;
                    while (leftPointer < rightPointer && nums[rightPointer] == nums[rightPointer-1]) rightPointer--;
                    leftPointer++;
                    rightPointer--;
                } else if (sum>0) {
                    rightPointer--;
                } else leftPointer++;
            }
        }
        return res;
    }
}
