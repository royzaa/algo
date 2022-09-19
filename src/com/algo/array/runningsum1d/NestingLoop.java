package com.algo.array.runningsum1d;

import java.util.Arrays;

public class NestingLoop {
    public static int[] runningSum(int[] nums) {
        int[] newNums = new int[nums.length];
        for (int i =0; i<nums.length; i++) {
            for (int j =0; j<=i; j++) {
                newNums[i] += nums[j];
            }
        }
        return newNums;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2,4,5};
       int[] val = runningSum(arr);

       System.out.println(Arrays.toString(val));
    }
}
