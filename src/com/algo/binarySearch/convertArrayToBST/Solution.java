package com.algo.binarySearch.convertArrayToBST;

import com.algo.binaryTree.levelOrderTraversal.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return helper(nums, 0, nums.length-1);
    }

    public TreeNode helper(int[]nums, int left, int right) {
        if (left>right) return null;
        int pivot = left + (right-left)/2;
        TreeNode node = new TreeNode(nums[pivot]);

        node.left = helper(nums, left, pivot -1);
        node.right = helper(nums, pivot+1, right);

        return node;
    }
}
