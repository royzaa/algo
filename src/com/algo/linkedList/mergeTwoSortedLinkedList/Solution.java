package com.algo.linkedList.mergeTwoSortedLinkedList;

public class Solution {

   public static ListNode  mergeTwoLists(ListNode l1, ListNode l2) {
       if(l1 == null)
           return l2;
       if(l2 == null)
           return l1;

       if(l1.val < l2.val) {
           l1.next = mergeTwoLists(l1.next, l2);
           return l1;
       } else {
           l2.next = mergeTwoLists(l1, l2.next);
           return l2;
       }
   }
    static ListNode linked1 = new ListNode(3);
    static ListNode linked2 = new ListNode(4, linked1);

    public static void main(String[] args) {

        mergeTwoLists(linked1, linked2);
    }
}
