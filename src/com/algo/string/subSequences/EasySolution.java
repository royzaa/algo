package com.algo.string.subSequences;

public class EasySolution {
    public static boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;
        int left = 0, right = 0;
        while(left < s.length() && right < t.length()){
            if(s.charAt(left) == t.charAt(right)){
                left++;
            }
            right++;
        }
        return left == s.length();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "abddasdsac";
        isSubsequence(s,t);
    }
}
