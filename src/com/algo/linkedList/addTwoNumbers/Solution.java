package com.algo.linkedList.addTwoNumbers;

import com.algo.linkedList.mergeTwoSortedLinkedList.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /**
         1. create a new head
         2. assign the new head into curent head variable (loop)
         3. create a new variable to store reverse remainder joined value, called carry
         4. while till l1 & 2 null
         5. if node ==  null, 0
         6. sum all node val + carry
         7. instantiate current head next to a new listnode with value of sum
         8. change l1 & l2 to its next head
         */

        ListNode res = new ListNode();
        ListNode curr = res;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;

            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);

            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return res.next;
    }
}
