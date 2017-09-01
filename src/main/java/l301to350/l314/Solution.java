package l301to350.l314;

import helpers.tree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {

    /**
     * https://leetcode.com/problems/binary-tree-vertical-order-traversal/description/
     */
    public List<List<Integer>> verticalOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        Map<Integer, List<Integer>> ans = new HashMap<>();

        Deque<TreeNode> nodeQ = new LinkedList<>();
        Deque<Integer> levQ = new LinkedList<>();

        nodeQ.add(root);
        levQ.add(0);

        int min = 0, max = 0;
        while (!nodeQ.isEmpty()) {
            TreeNode parent = nodeQ.remove();
            Integer level = levQ.remove();

            min = Math.min(min, level);
            max = Math.max(max, level);

            if (!ans.containsKey(level)) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(parent.val);

                ans.put(level, tmp);
            } else {
                ans.get(level).add(parent.val);
            }

            if (parent.left != null) {
                nodeQ.add(parent.left);
                levQ.add(level - 1);
            }

            if (parent.right != null) {
                nodeQ.add(parent.right);
                levQ.add(level + 1);
            }
        }

        List<List<Integer>> list = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            list.add(ans.get(i));
        }
        return list;
    }
}
