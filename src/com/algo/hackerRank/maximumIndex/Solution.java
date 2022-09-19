package com.algo.hackerRank.maximumIndex;

public class Solution {
    public int maxIndex(int steps, int badIndex) {
        int max_index = 0;

        for (int i = 1; i <= steps; i++) {
            max_index += i;
        }
        int current_index = max_index, step = steps;

        while (true) {
            while (current_index > 0 &&  steps > 0) {
                current_index -= steps;
                if (current_index == badIndex)
                {
                    current_index += steps;
                }
                steps--;
            }

            if (current_index < 1) break;
            else {
                steps = step;
                current_index = max_index - 1;
                max_index--;
                if (current_index == badIndex) {
                    current_index = max_index - 1;
                    max_index--;
                }
            }
        }
        return max_index;
    }
}
