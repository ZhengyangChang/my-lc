package l1to50.l39;

import lombok.val;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestL39 {
    @Test
    public void testL39() {
        Solution solution = new Solution();
        int[] candidates = {2,3,6,7};
        val ans = solution.combinationSum(candidates, 7);

        List<List<Integer>> expected = new ArrayList<>();

        val expected1 = Arrays.asList(2, 2, 3);
        val expected2 = Arrays.asList(7);
        expected.add(expected1);
        expected.add(expected2);
        Assert.assertEquals(expected, ans);
    }
}
