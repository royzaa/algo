package com.algo.slidingWindow.findAnagrams;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean compare(char[] s1, char[] s2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i =0; i<s1.length && i < s2.length;i++) {
            count1[s1[i] - 97]++;
            count2[s2[i] - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) return false;
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> arr = new ArrayList<>();
        for (int i=0; i<s.length() - p.length() + 1; i++) {
            String subs = s.substring(i, i+p.length());;

            char[] subsChar = subs.toCharArray();
            char[] pChar = p.toCharArray();

            if(compare(subsChar, pChar)) {
                arr.add(i);
            }
        }
        return arr;
    }
}
