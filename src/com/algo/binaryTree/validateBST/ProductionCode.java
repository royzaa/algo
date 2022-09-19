package com.algo.binaryTree.validateBST;

import com.algo.binaryTree.levelOrderTraversal.TreeNode;

class NodeInfo {
    boolean isBST;
    long min;
    long max;
    public NodeInfo(boolean isBST, long min, long max) {
        this.isBST = isBST;
        this.min = min;
        this.max = max;
    }
}


public class ProductionCode {
    private NodeInfo isValidBSTUtil(TreeNode root) {
        if(root == null) {
            return (new NodeInfo(true, Long.MAX_VALUE, Long.MIN_VALUE));
        }

        NodeInfo leftT = isValidBSTUtil(root.left);
        NodeInfo rightT = isValidBSTUtil(root.right);

        long mini = Math.min(root.val, Math.min(leftT.min, rightT.min));
        long maxi = Math.max(root.val, Math.max(leftT.max, rightT.max));

        if(leftT.isBST && rightT.isBST && leftT.max < (long)root.val && root.val < (long)rightT.min) {
            // tree at node = root is a BST
            return (new NodeInfo(true, mini, maxi));
        }
        return (new NodeInfo(false, mini, maxi));
    }

    public boolean isValidBST(TreeNode root) {
        /* Approach
        - TC --> O(N) || SC --> O(N) || Think of a skewed tree
        - Post-order traversal || Bottoms-up
        */
        return isValidBSTUtil(root).isBST;
    }
}
