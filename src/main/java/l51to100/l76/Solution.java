package l51to100.l76;

public class Solution {

    public String minWindow(String s, String t) {
        int[] pos = new int[128];
        for(int i = 0; i < t.length(); i++){
            pos[((int) t.charAt(i))]++;
        }
        int start = 0, end = 0, head = 0, tail = 0;
        int counter = t.length();
        int minValue = Integer.MAX_VALUE;
        while (end < s.length()) {
            if (pos[s.charAt(end)] > 0) counter--;
            pos[s.charAt(end)]--;
            end ++;

            while(counter == 0) {

                minValue = Math.min(end - start, minValue);
                if (end - start == minValue) {
                    head = start;
                    tail = end;
                }

                if (pos[s.charAt(start++)]++ == 0) {
                    counter++;
                }
            }
        }

        return minValue == Integer.MAX_VALUE ? "" : s.substring(head, tail);
    }

}