package com.algo.array.singleNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapSolution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : nums) {
            if (map.containsKey(e)) map.remove(e);
            else {
                map.put(e, 1);
            }
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        return keys.get(0);
    }
}
