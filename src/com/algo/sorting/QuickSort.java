package com.algo.sorting;

import java.util.Random;

public class QuickSort {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);

        return nums;
    }

    public void quickSort(int[] nums, int low, int high) {
        if (low >= high) return;

        int pivotIndex = new Random().nextInt(high-low) + low;
        swap(nums, pivotIndex, high);
        int pivot = nums[high];

        int left = partition(nums, low, high, pivot);

        quickSort(nums, low, left-1);
        quickSort(nums, left+1, high);

    }

    public int partition(int[] nums, int low, int high, int pivot) {
        int left = low;
        int right = high;

        while (left < right) {
            while (nums[left] <= pivot && left < right) left++;
            while (nums[right] >= pivot && left < right) right--;

            swap(nums, left, right);
        }
        swap(nums, left, high);

        return left;
    }

    public void swap(int[] nums, int low, int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
}
