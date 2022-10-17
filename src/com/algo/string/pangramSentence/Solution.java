package com.algo.string.pangramSentence;

public class Solution {
    /**
     * Definition of pangram: A pangram is a sentence where every
     * letter of the English alphabet appears at least once.
     *
     * @param sentence a string in lowercase
     * @return boolean
     *
     */
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];

        for (char c : sentence.toCharArray()) {
            seen[c - 'a'] = true;
        }

        for (boolean status : seen) {
            if (!status) return false;
        }

        return true;
    }
}
