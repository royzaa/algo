package com.algo.stack.decodeString;

public class Solution {
    int i = 0;
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        String tmp_string = "";
        while (i < s.length()) {
            char c = s.charAt(i);
            i++;
            if (c == '[') {
                tmp_string = decodeString(s); // do sub-problem
                for (int j = 0; j < count; j++) {
                    sb.append(tmp_string);
                }
                count = 0; // reset counter
            } else if (c == ']') { // sub-problem complete
                break;
            } else if (Character.isAlphabetic(c)) {
                sb.append(c);
            } else {
                count = count * 10 + c - '0';
            }
        }
        return sb.toString();
    }
}
