package com.algo.hackerRank.maximumIndex;

import java.util.Arrays;

public class bits {
    public static void main(String[] args) {
        int input = 15;

        int[] bits = new int[31];
        for (int i = 6; i >= 0; i--) {
            bits[i] = (input & (1 << i)) != 0 ? 1 : 0;
        }

//        int i = 0;
//        while (input > 0) {
//            bits[i] = input  % 2;
//            input >>= 1;
//        }

        System.out.println(input + " = " + Arrays.toString(bits));
    }
}
