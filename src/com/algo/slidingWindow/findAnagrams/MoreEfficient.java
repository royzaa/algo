package com.algo.slidingWindow.findAnagrams;

import java.util.ArrayList;
import java.util.List;

public class MoreEfficient {
    boolean compare(int[] a, int [] b){
        for(int i=0; i<26; i++){
            if(a[i]!=b[i])  return false;
        } return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        if (p.length() <= s.length()) {
            int[] pTable = new int[26], sTable = new int[26];

            for (int i = 0; i < p.length(); i++) {
                sTable[s.charAt(i) - 'a']++;
                pTable[p.charAt(i) - 'a']++;
            }
            if (compare(sTable, pTable)) list.add(0);

            for (int i = p.length(); i < s.length(); i++) {
                sTable[s.charAt(i) - 'a']++;
                sTable[s.charAt(i - p.length()) - 'a']--;
                if (compare(sTable, pTable)) list.add(i - p.length() + 1);
            }
        }
        return list;
    }
}
