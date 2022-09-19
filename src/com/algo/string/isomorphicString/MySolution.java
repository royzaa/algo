package com.algo.string.isomorphicString;

import java.util.HashMap;
import java.util.Map;

public class MySolution {
    public static void main(String[] args) {
       System.out.println( isIsomorphic("bcb", "fcb"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> hashMap = new HashMap<>();


        for (int i = 0; i < s.length() ; i++) {

            if (hashMap.containsKey(s.charAt(i)) && hashMap.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            } else if (!hashMap.containsKey(s.charAt(i)) && hashMap.containsValue(t.charAt(i))) {
                return false;
            }else {
                hashMap.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
