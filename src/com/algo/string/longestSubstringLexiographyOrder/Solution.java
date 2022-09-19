package com.algo.string.longestSubstringLexiographyOrder;

public class Solution {
    String longestSubstringInLexiographyOrder(String s) {
        char c = ' ';
        String temp = "";
        String found = "";

        for (char i : s.toCharArray()) {
            if (i >= c) temp += c;
            else temp = String.valueOf(i);
            if (temp.length() > found.length())
                found = temp;
            c = i;
        }

        return found;
    }
}
