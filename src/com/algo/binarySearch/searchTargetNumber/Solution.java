package com.algo.binarySearch.searchTargetNumber;

public class Solution {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int pivot =0;
        while (left <= right ) {
            pivot = left + (right - left) /2;
            if (nums[pivot] == target) return pivot;
            if (nums[pivot] > target) {
                right = pivot-1;
            } else {
                left = pivot + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums =  {-1,0,3};
      int num=  search(nums, 3);
        System.out.println("print" + num);
    }
}
