package l1to50.l22;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void rec(List<String> ans, int left , int right, String now){
        if (left == 0 && right ==0) {
            ans.add(now);
        }
        else{
            if (left > 0) rec(ans, left - 1, right + 1, now + "(");
            if (right > 0) rec(ans, left, right - 1, now + ")");
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        rec(ret,n,0, "");
        return ret;
    }
}
