package helpers.tree;

import org.junit.Assert;
import org.junit.Test;


public class TreeTest {

    @Test
    public void testSerialize() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        Assert.assertEquals("[1,2,3,null,null,4,5]", Trees.serialize(root));

        // deserialize
        TreeNode test = Trees.deserialize("[1,2,3,null,null,4,5]");

        Assert.assertNotNull(test);
        Assert.assertEquals(root.toString(), test.toString());
    }
}
