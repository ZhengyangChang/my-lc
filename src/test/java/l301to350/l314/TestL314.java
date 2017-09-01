package l301to350.l314;

import helpers.Asserts;
import helpers.tree.Trees;
import lombok.val;
import org.junit.Test;

public class TestL314 {

    @Test
    public void testL314() {
        Solution solution = new Solution();

        val root = Trees.deserialize("[3,9,8,4,0,1,7,null,null,null,2,5]");
        val ans = solution.verticalOrder(root);

        val expected = "[\n" +
                "  [4],\n" +
                "  [9,5],\n" +
                "  [3,0,1],\n" +
                "  [8,2],\n" +
                "  [7]\n" +
                "]";

        Asserts.assertEqualWithOrder(expected, ans);

    }
}
