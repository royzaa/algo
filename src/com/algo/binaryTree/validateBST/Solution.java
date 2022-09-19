package com.algo.binaryTree.validateBST;

import com.algo.binaryTree.levelOrderTraversal.TreeNode;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> traversal = new ArrayList<>();
    public boolean isValidBST(TreeNode node) {
        helper(node);
        for (int i = 1; i < traversal.size(); i++) {
            if (traversal.get(i-1) >= traversal.get(i)) return false;
        }
        return true;
    }

    private void helper(TreeNode node) {
        if (node == null) return;

        helper(node.left);
        traversal.add(node.val);
        helper(node.right);
    }
}
