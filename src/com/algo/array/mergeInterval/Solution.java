package com.algo.array.mergeInterval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> temp = new ArrayList<>();
        int leftLeft = intervals[0][0];
        int leftRight = intervals[0][1];
        int j = 1;
        while (j < intervals.length) {
            int currLeft = intervals[j][0];
            int currRight = intervals[j][1];
            if (leftRight >= currLeft) {
                leftRight = Math.max(currRight, leftRight);
            } else {
                temp.add(new int[] {leftLeft, leftRight});
                leftLeft = currLeft;
                leftRight = currRight;
            }
            j++;
        }
        temp.add(new int[] {leftLeft, leftRight});
        int[][] newArr = new int[temp.size()][2];
        for (int i = 0; i<temp.size(); i++) {
            newArr[i] = temp.get(i);
        }
        return newArr;
    }
}
