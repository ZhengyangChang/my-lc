package l301to350.l301;

import helpers.Asserts;
import lombok.val;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;

public class TestL301 {

    @Test
    public void testL301() {
        Solution solution = new Solution();
        val ans = solution.removeInvalidParentheses("()())()");

        Collection<String> expected =  new HashSet<>();
        expected.add("()()()");
        expected.add("(())()");

        Asserts.assertEqualNoOrder(expected, ans);

    }

}
