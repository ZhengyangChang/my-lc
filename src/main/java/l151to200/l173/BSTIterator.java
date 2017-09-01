package l151to200.l173;

import helpers.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BSTIterator {

    private Deque<TreeNode> stack = new ArrayDeque<>();

    public BSTIterator(TreeNode root) {
        pushNodeToStack(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {

        TreeNode cur = stack.pop();
        int ret = cur.val;

        pushNodeToStack(cur.right);

        return ret;
    }

    private void pushNodeToStack(TreeNode node) {
        while(node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}

