package com.algo.binaryTree.levelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        levelWalk(result, root, 0);
        return result;
    }

    public void levelWalk(List<List<Integer>> result, TreeNode root, int level) {
        if (root == null) return;
        if (level >= result.size()) {
            result.add(new ArrayList<Integer>());
        }
        result.get(level).add(root.val);
        levelWalk(result, root.left, level+1);
        levelWalk(result, root.right, level+1);
    }
}
