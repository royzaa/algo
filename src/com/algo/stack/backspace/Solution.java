package com.algo.stack.backspace;

import java.util.Stack;

public class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for (int i =0; i<s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!s1.empty()) s1.pop();
                continue;
            }
            s1.push(s.charAt(i));
        }
        for (int i =0; i<t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!s2.empty()) s2.pop();
                continue;
            }
            s2.push(t.charAt(i));
        }
        return s1.equals(s2);
    }
}
