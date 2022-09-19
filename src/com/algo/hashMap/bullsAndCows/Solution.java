package com.algo.hashMap.bullsAndCows;

import java.util.HashMap;

public class Solution {
    public String getHint(String secret, String guess) {
        int cows = 0;
        int bulls = 0;
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapG = new HashMap<>();

        for(int i = 0; i < secret.length(); i++) {
            char c1 = secret.charAt(i);
            char c2 = guess.charAt(i);

            if(c2 == c1) {
                bulls++;
                continue;
            }

            mapS.put(c1, mapS.getOrDefault(c1, 0) + 1);
            mapG.put(c2, mapG.getOrDefault(c2, 0) + 1);
        }

        for(Character c : mapG.keySet()) {
            if(!mapS.containsKey(c)) continue;

            cows += Math.min(mapS.get(c), mapG.get(c));
        }
        return bulls + "A" + cows + "B";
    }
}
