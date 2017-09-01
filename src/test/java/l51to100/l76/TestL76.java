package l51to100.l76;

import lombok.val;
import org.junit.Assert;
import org.junit.Test;

public class TestL76 {

    @Test
    public void testL76() {
        Solution solution = new Solution();
        val ans = solution.minWindow("ADOBECODEBANC", "ABC");
        Assert.assertEquals("BANC", ans);
    }
}
