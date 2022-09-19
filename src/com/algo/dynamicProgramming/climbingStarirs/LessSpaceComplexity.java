package com.algo.dynamicProgramming.climbingStarirs;

public class LessSpaceComplexity {
    public int climbStairs(int n) {
        if (n == 1) return n;
        int oneStep = 1;
        int twoStep = 2;

        for (int i = 3; i<=n; i++) {
            int tmp = twoStep;
            twoStep = oneStep + twoStep;
            oneStep = tmp;
        }
        return twoStep;
    }
}
