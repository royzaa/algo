package com.algo.array.pivotIndex;

public class NestedLoop {
    public static int helper(int[] arr) {
        int total = 0;
        for (int i=0; i<arr.length; i++) {
            total+=arr[i];
        }
        return total;
    }
    public static int pivotIndex(int[] nums) {

        int pivot = 0;
        for (int i = 0; i< nums.length; i++) {
            int[] leftSide = new int[pivot];
            int[] rightSide = new int[nums.length - 1 - pivot];

            for (int j=0; j<leftSide.length; j++) {
                leftSide[j]=nums[j];
            }

            for (int j=0; j<rightSide.length; j++) {
                rightSide[j]=nums[pivot + 1 + j];
            }


            if (helper(rightSide) == helper(leftSide)) {
                return pivot;
            }

            pivot++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1,-1,0,1,1,0};

        int index = pivotIndex(arr);

        System.out.println(index);

    }
}
