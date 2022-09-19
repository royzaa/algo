package com.algo.heap.lastStoneWeight;

import java.util.PriorityQueue;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);

        for (int e:stones) {
            pq.offer(e);
        }

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            if (first > second) pq.offer(first-second);
        }

        return pq.isEmpty() ? 0 : pq.peek();
    }
}
