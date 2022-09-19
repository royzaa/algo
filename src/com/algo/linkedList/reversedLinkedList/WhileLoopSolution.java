package com.algo.linkedList.reversedLinkedList;

import com.algo.linkedList.mergeTwoSortedLinkedList.ListNode;

public class WhileLoopSolution {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode nextHead = head.next;
            head.next = prev;
            prev = head;
            head = nextHead;
        }

        return prev;
    }
    /* for instance if the linked list = 1 > 2 > 3 > null

    nextHead = 2
    head.next = null
    prev = 1
    head = 2

    nextHead = 3
    head.next = 1
    prev = 2
    head = 3

    nextHead = null
    head.next = 2
    prev = 3
    head = null */
}
