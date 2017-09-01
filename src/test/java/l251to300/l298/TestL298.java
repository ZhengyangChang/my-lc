package l251to300.l298;

import helpers.tree.Trees;
import org.junit.Assert;
import org.junit.Test;

public class TestL298 {

    @Test
    public void testL298() {
        Solution solution = new Solution();

        int ans = solution.longestConsecutive(Trees.deserialize("[1,null,3,2,4,null,null,null,5]"));

        Assert.assertEquals(3, ans);

        int ans2 = solution.longestConsecutive(Trees.deserialize("[2,null,3,2,null,1]"));

        Assert.assertEquals(2,ans2);
    }
}
