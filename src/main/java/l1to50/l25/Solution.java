package l1to50.l25;

import helpers.list.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode answer = head, current = head;
        ListNode former = head;
        boolean first = true;
        while(true){
            if(current == null) return answer;
            ListNode end = current;
            for(int i=0;i< k - 1;i++){
                end = end.next;
                if(end == null)
                    return answer;
            }
            reverse(current,end);

            if(current.next == null){
                if (first) {
                    answer = end;
                    first = false;
                } else{
                    former.next = end;
                }
                return answer;
            }
            else
            {
                if (first) {
                    answer = end;
                    first = false;
                } else{
                    former.next = end;
                }
                former = current;
                current = current.next;

            }
        }
    }

    private void reverse(ListNode start, ListNode end) {
        if(start == null || start == end) return;
        ListNode tmp = start.next;
        start.next = end.next;
        end.next = start;
        reverse(tmp,end);
    }
}