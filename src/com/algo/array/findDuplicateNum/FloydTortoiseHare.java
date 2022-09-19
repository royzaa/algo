package com.algo.array.findDuplicateNum;

public class FloydTortoiseHare {

    public int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];
        while (true) {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
            if (tortoise == hare) {
                break;
            }
        }

        int tortoisePoint = nums[0];
        int slowDownHare = hare;

        while (tortoisePoint != slowDownHare) {
            tortoisePoint = nums[tortoisePoint];
            slowDownHare = nums[slowDownHare];
        }

        return slowDownHare;
    }
}
