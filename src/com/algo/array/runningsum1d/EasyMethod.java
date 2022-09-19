package com.algo.array.runningsum1d;

import java.util.Arrays;

public class EasyMethod {
    public  static int[] runningSum(int[] nums) {
        int[] val = new int[nums.length];
        val[0] = nums[0];

        for(int i = 1; i<nums.length; i++) {
            val[i] = val[i-1] + nums[i];
        }

        return val;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2,4,5};
        int[] val = runningSum(arr);

        System.out.println(Arrays.toString(val));
    }
}
