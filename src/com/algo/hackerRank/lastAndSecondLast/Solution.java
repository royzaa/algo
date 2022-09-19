package com.algo.hackerRank.lastAndSecondLast;

public class Solution {
    public static void main(String[] args) {

    }

    public static String lastLetters(String word) {
        int lastIndex = word.length() -1;

        return String.format("%c %c", word.charAt(lastIndex), word.charAt(lastIndex-1));

    }
}
