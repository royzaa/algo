package com.algo.array.threeSum;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        int currNum;
        Arrays.sort(nums);
        for(int i =0; i<nums.length;i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;
            currNum = nums[i];
            Map<Integer, Integer> map = new HashMap<>();
            for (int j =i; j<nums.length; j++) {

                int complement = (nums[j] + currNum) * -1;
                if (map.containsKey(complement) && j!=i && i!= map.get(complement) && map.get(complement) != j) {
                    List<Integer> triplet = new ArrayList<>();

                    triplet= Arrays.asList(currNum, nums[j], complement);

                    res.add(triplet);
                    while(j < nums.length-1 && nums[j] == nums[j+1]) j++;
                }
                map.put(nums[j], j);
            }
        }
        return res;
    }
}
