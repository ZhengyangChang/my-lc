package l1to50.l39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public void rec(List<List<Integer>> ans, List<Integer> cur, int[] candidates, int target, int start){
        int sum = cur.stream().mapToInt(Integer::intValue).sum();
        if (sum == target) {
            List<Integer> toAdd = new ArrayList<>();
            toAdd.addAll(cur);
            ans.add(toAdd);
        }
        else{
            for (int i = start; i< candidates.length && sum + candidates[i] <= target; i++) {
                int top = cur.size();
                cur.add(candidates[i]);
                rec(ans, cur, candidates, target, i);
                cur.remove(top);
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        rec(ans, new ArrayList<>(), candidates, target, 0);

        return ans;

    }

}