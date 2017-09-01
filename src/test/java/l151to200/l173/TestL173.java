package l151to200.l173;

import helpers.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestL173 {
    @Test
    public void testL173() {

        List<Integer> ans = new ArrayList<>();

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(5);
        BSTIterator i = new BSTIterator(root);
        while (i.hasNext())  ans.add(i.next());

        Assert.assertEquals("[1, 2, 3, 4, 5]",ans.toString());
    }
}
