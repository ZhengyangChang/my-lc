package l351to400.l388;

import lombok.val;
import org.junit.Assert;
import org.junit.Test;

public class TestL388 {

    @Test
    public void testL388() {
        Solution solution = new Solution();
        val ans = solution.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext");

        Assert.assertEquals(20, ans);

    }
}
