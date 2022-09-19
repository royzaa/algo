package com.algo.heap.medianInDataStream;

import java.util.PriorityQueue;

public class MedianFinder {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    public MedianFinder() {
        minHeap = new PriorityQueue<>((a, b) -> a-b);
        maxHeap = new PriorityQueue<>((a, b)-> b-a);
    }


    public void addNum(int num) {
        if (maxHeap.size() == 0 || num < maxHeap.peek()) {
            maxHeap.offer(num);
        } else minHeap.offer(num);

        // balancing
        if (minHeap.size() + 1 < maxHeap.size()) {
            minHeap.offer(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }

    }

    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) return (double)maxHeap.peek();
        return (maxHeap.peek() + minHeap.peek())/2.0;
    }
}
