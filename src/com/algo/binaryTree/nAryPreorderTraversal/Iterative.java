package com.algo.binaryTree.nAryPreorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Iterative {

    public List<Integer> preorder(Node root) {
        List<Integer> arr = new ArrayList<>();
        if (root == null) return arr;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node curNode = stack.peek();
            stack.pop();
            arr.add(curNode.val);
            for (int i=curNode.children.size() -1; i>= 0; i--) {
                    stack.push(curNode.children.get(i));
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Stack<String> fruits= new Stack<>();

    }
}
