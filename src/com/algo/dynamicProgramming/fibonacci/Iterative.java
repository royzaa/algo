package com.algo.dynamicProgramming.fibonacci;

public class Iterative {
    public int fib(int n) {
        if (n<2) return n;

        int prev = 0;
        int curr = 1;

        for (int i =2; i<=n; i++ ) {
            int tmp = curr;
            curr = prev + curr;
            prev = tmp;
        }

        return curr;
    }
}
