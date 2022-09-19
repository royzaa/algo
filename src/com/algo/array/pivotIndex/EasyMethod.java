package com.algo.array.pivotIndex;

public class EasyMethod {
    public static int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums)
            total += num;

        int curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (curSum == total - curSum - nums[i]) {
                return i;
            }
            curSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1,-1,0,1,1,0};

        int index = pivotIndex(arr);

        System.out.println(index);
    }
}
