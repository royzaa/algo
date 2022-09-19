package com.algo.heap.kFrequentWords;

import java.util.*;

public class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();

        for (String e:words) {
            map.put(e, map.getOrDefault(e, 0) +1);
        }

        // order in ascending
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() == b.getValue() ?
                b.getKey().compareTo(a.getKey()) : a.getValue() - b.getValue());

        for (Map.Entry<String, Integer> e: map.entrySet()) {
            pq.offer(e);
            // delete the top most entry till the pq size equal to K
            if (pq.size() > k) pq.poll();
        }

        List<String> res = new LinkedList();

        while(!pq.isEmpty()) res.add(0, pq.poll().getKey());
        return res;
    }

}
