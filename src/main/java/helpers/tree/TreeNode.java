package helpers.tree;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    @Override
    public String toString() {
        return Trees.serialize(this);
    }

}