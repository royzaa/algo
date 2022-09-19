package com.algo.linkedList.middleOfLinkedList;


import com.algo.linkedList.mergeTwoSortedLinkedList.ListNode;

public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode middleHead = null;
        ListNode hare = head;
        ListNode tortoise = head;
        while (true) {
            if (hare.next == null) {
                middleHead = tortoise;
                break;
            } else if(hare.next.next == null) {
                middleHead = tortoise.next;
                break;
            }
            tortoise = tortoise.next;
            hare = hare.next.next;
        }
        return middleHead;
    }
}
