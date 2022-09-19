package com.algo.string.romanToInt;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int romanToInt(String roman) {
        Map<Character,Integer> numbersMap = new HashMap<>();
        numbersMap.put('I',1);
        numbersMap.put('V',5);
        numbersMap.put('X',10);
        numbersMap.put('L',50);
        numbersMap.put('C',100);
        numbersMap.put('D',500);
        numbersMap.put('M',1000);

        int result=0;

        for (int i = 0; i < roman.length(); i++) {
            char ch = roman.charAt(i);
            int currentInt = numbersMap.get(ch);
            if (i>0 && currentInt > numbersMap.get(roman.charAt(i-1)) ) {
                result += currentInt - 2*numbersMap.get(roman.charAt(i-1));
            } else {
                result += currentInt;
            }
        }
        return result;
    }
}
