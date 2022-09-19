package com.algo.dynamicProgramming.minCostClimbingStairs;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int oneBehind = 0;
        int twoBehind = 0;

        for (int i = 0; i< cost.length; i++) {
            int currentStep = cost[i] + Math.min(oneBehind, twoBehind);
            twoBehind = oneBehind;
            oneBehind = currentStep;
        }

        return Math.min(oneBehind, twoBehind);
    }
}
