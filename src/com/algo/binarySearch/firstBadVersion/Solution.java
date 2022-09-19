package com.algo.binarySearch.firstBadVersion;

public class Solution {
    boolean isBadVersion (int a) {
        return false;
    }
    public int firstBadVersion(int n) {
        int start =0, end = n, pivot =0;
        while (start < end) {
            pivot = start + (end - start)/2;
            if (isBadVersion(pivot)) end = pivot;
            else start = pivot + 1;
        }
        return end;
    }
}

