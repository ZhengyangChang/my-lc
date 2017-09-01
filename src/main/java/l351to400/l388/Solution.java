package l351to400.l388;

class Solution {

    public int lengthLongestPath(String input) {
        String[] parts = input.split("\n");
        int[] lengths = new int[parts.length];
        int ans = 0;
        for (String s:
             parts) {
            int depth = s.lastIndexOf("\t") + 1;
            lengths[depth] = s.substring(depth).length();

            if (s.contains(".")) ans = Math.max(ans, sum(lengths,depth) + depth);
        }
        return ans;
    }

    private int sum(int[] arr, int i){
        int sum = 0;
        for (int j = 0; j <= i; j++) {
            sum += arr[j];
        }
        return sum;
    }
}