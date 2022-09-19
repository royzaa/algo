package com.algo.array.majorityElement;

import java.util.*;

public class HashMapSolution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : nums) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }

        Map.Entry<Integer, Integer> res = new AbstractMap.SimpleEntry<>(0,0);

        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(res.getValue() < e.getValue()) res =e;
        }

        return  res.getKey();
    }
}
