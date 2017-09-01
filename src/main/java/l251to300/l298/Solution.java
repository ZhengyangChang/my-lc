package l251to300.l298;

import helpers.tree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public int longestConsecutive(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Deque<TreeNode> nodes = new LinkedList<>();
        Deque<Integer> andTheirDepth = new LinkedList<>();

        nodes.add(root);
        andTheirDepth.add(1);
        int max = 0;

        while (!nodes.isEmpty()) {
            TreeNode node = nodes.remove();
            Integer depth = andTheirDepth.remove();

            if (node.left != null) {
                if (node.left.val == node.val + 1) {
                    nodes.add(node.left);
                    andTheirDepth.add(depth + 1);
                } else {
                    nodes.add(node.left);
                    andTheirDepth.add(1);

                    max = Math.max(max, depth);
                }
            }

            if (node.right != null) {
                if (node.right.val == node.val + 1) {
                    nodes.add(node.right);
                    andTheirDepth.add(depth + 1);
                } else {
                    nodes.add(node.right);
                    andTheirDepth.add(1);

                    max = Math.max(max, depth);
                }
            }

            if (node.left == null && node.right == null) {
                max = Math.max(max, depth);
            }
        }
        return max;
    }
}