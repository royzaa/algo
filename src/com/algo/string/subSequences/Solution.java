package com.algo.string.subSequences;

public class Solution {

    public static boolean isSubsequences(String s, String t) {
        if (s.isEmpty()) return true;
        int j = 0;
        for (int i = 0; i<t.length() ; i++) {
            int curLen = t.length();
            if (curLen == s.length()) break;
            if (t.charAt(i) == s.charAt(j)) {
                if (j < s.length() - 1) {
                    j++;
                }
            } else if (t.charAt(i) != s.charAt(j)) {
                if (i==0) {
                    t = t.substring(1, curLen);

                } else {
                    t =  t.substring(0, i) + t.substring(i+1, curLen);
                }
                i--;
            }
        }
        return s.equals(t);
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "abddasdsac";
        isSubsequences(s,t);
    }
}
