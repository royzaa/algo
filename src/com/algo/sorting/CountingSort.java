package com.algo.sorting;

public class CountingSort {
    public int[] counting(int[] nums) {
        int length = nums.length;

        // create new array with same length
        int[] output = new int[length];

        // find max integer in the array
        int max = nums[0];
        for (int e : nums) {
            if (max < e) max = e;
        }

        // create counting array at size of max integer + 1 for zero index
        int[] count = new int[max + 1];

        // count the occurrences
        for (int e: nums) {
            count[e]++;
        }

        // sum the cumulative ith index
        for (int i = 1; i<= max; i++) {
            count[i] += count[i - 1];
        }

        // store to the output
        for (int e : nums) {
            output[count[e] - 1] = e;
            count[e]--;
        }

        return output;
    }
}
