package com.algo.binaryTree.lowesrCommonAncestor;

import com.algo.binaryTree.levelOrderTraversal.TreeNode;

public class Solution {
    // depth first strategis LRD

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return helper(root,p, q);
    }

    public TreeNode helper(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) return null;

        if (node.val < p.val && node.val < q.val) {
            return helper(node.right, p, q);
        } else if (node.val > p.val && node.val > q.val) {
            return helper(node.left, p, q);
        } else return node;
    }
}
