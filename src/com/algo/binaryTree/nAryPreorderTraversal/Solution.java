package com.algo.binaryTree.nAryPreorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> arr = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root == null) return new ArrayList<>();
        arr.add(root.val);
        for (Node i : root.children) preorder(i);
        return arr;
    }

}
