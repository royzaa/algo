package com.algo.hackerRank.possiblePath;

public class Solution {

    public static void main(String[] args) {

    }

    public static boolean destinationReachable(int x1, int y1, int x2, int y2) {
        if (x1 > x2 || y1 > y2) return false;
        if (x1 == x2 && y1 == y2) return true;

        return destinationReachable(x1 + y1, y1, x2, y2) || destinationReachable(x1, x1+ y1, x2, y2);
    }
}
