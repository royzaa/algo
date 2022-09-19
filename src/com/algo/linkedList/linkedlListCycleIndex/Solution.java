package com.algo.linkedList.linkedlListCycleIndex;

import com.algo.linkedList.mergeTwoSortedLinkedList.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;

        do {
            if (hare == null || hare.next == null) return null;
            tortoise = tortoise.next;
            hare = hare.next.next;
        } while (tortoise != hare);

        while(true) {
            if (tortoise == head) break;
            head = head.next;
            tortoise = tortoise.next;
        }
        return tortoise;
    }
}
