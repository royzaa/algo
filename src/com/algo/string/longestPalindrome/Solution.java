package com.algo.string.longestPalindrome;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int longestPalindrome(String s) {
        if(s.length() == 1) return 1;
        Map<Character, Integer> hashMap = new HashMap<>();

        int len = 0;
        int theRest = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            }
            else  {
                hashMap.put(s.charAt(i), 1);
            }
        }

        for (int val:hashMap.values()) {
            if (val % 2 !=0) {
                if(val == 1) theRest = 1;
                if (val > 1 && val % 2 == 1) {
                    len += val - 1;
                    theRest = 1;
                }
            } else {
                len += val;
            }
        }

        return theRest > 0 ? len + 1 : len;
    }

    public static void main(String[] args) {
        longestPalindrome("abccccdd");
        Map<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('G', 1);
        System.out.println(hashMap.containsKey('g'));
    }
}
