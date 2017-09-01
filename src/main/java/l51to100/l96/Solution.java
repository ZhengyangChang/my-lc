package l51to100.l96;

class Solution {
    public int numTrees(int n) {
        if(n == 0) return 1;

        int[] arr = new int[n + 1];
        for(int i = 0; i <= n; i++) {
            rec(i, arr);
        }

        return arr[n];
    }

    private void rec(int n, int[] arr) {
        if(n == 0) {
            arr[n] = 1;
            return;
        }

        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans += arr[i] * arr[n - 1 - i];
        }
        arr[n] = ans;
    }
}