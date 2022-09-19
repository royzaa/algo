package com.algo.linkedList.reversedLinkedList;

import com.algo.linkedList.mergeTwoSortedLinkedList.ListNode;

public class RecursionSolution {

    public ListNode helper(ListNode next, ListNode curr, ListNode prev) {
       curr.next = prev;

        if (next == null) {
            return curr;
        }

        return helper(next.next, next, curr);
    }
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;

        ListNode prev = null;
        ListNode current = head;
        ListNode next = head.next;

        return helper(next, current, prev);
    }
}
