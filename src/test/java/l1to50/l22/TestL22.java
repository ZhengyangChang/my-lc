package l1to50.l22;

import lombok.val;
import org.junit.Assert;
import org.junit.Test;

public class TestL22 {

    @Test
    public void testL22() {
        Solution solution = new Solution();
        val ans = solution.generateParenthesis(3);

        Assert.assertEquals("[((())), (()()), (())(), ()(()), ()()()]", ans.toString());
    }
}
