package helpers.tree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * l497
 * A common way used to serialize tree in LC OJ
 */
public class Trees {
    private static final String SPLITTER = ",";
    private static final String NN = "null";
    private static final String BR_START = "[";
    private static final String BR_END = "]";

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);

        StringBuilder sb = new StringBuilder();
        sb.append(BR_START);
        while (!deque.isEmpty()) {
            TreeNode node = deque.pop();

            if (node == null) sb.append(NN);
            else {

                sb.append(node.val);
                if (node.right == null && node.left == null && nullElements(deque)) break;
                deque.add(node.left);
                deque.add(node.right);
            }
            sb.append(SPLITTER);
        }
        sb.append(BR_END);
        return sb.toString();
    }

    public static TreeNode deserialize(String s) {
        String[] parts = s.split(SPLITTER);
        Deque<Integer> intLinkedList = new LinkedList<>();
        for (String numString:
                parts) {
            if (numString.startsWith(BR_START)) {
                numString = numString.substring(1);
            }

            if (numString.endsWith(BR_END)) {
                numString = numString.substring(0, numString.length() - 1);
            }

            if (numString.isEmpty()) {
                return null;
            }
            if (numString.equals(NN)) {
                intLinkedList.add(null);
            } else {
                intLinkedList.add(Integer.valueOf(numString));
            }
        }

        if (intLinkedList.isEmpty()) return null;
        TreeNode root = new TreeNode(intLinkedList.remove());

        Deque<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty() && !intLinkedList.isEmpty()) {
            Integer left = intLinkedList.remove();
            TreeNode parent = nodeQueue.remove();

            if (left != null) {
                parent.left = new TreeNode(left);
                nodeQueue.add(parent.left);
            }

            if (intLinkedList.isEmpty()) break;
            Integer right = intLinkedList.remove();
            if (right != null) {
                parent.right = new TreeNode(right);
                nodeQueue.add(parent.right);
            }
        }

        return root;
    }

    private static boolean nullElements(Deque deque) {
        for (Object o:
                deque) {
            if (o != null) {
                return false;
            }
        }
        return true;
    }
}
