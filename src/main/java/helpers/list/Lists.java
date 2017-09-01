package helpers.list;

import java.util.Deque;
import java.util.LinkedList;

public class Lists {

    private static final String SPLITTER = ",";
    private static final String BR_START = "[";
    private static final String BR_END = "]";

    public static String serialize(ListNode head) {
        if (head == null) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append(BR_START);
        while (true) {
            sb.append(head.val);

            if (head.next == null) break;
            sb.append(SPLITTER);

            head = head.next;
        }

        sb.append(BR_END);

        return sb.toString();
    }
    public static ListNode deserialize(String s) {
        String[] parts = s.split(SPLITTER);
        Deque<Integer> linkedList = new LinkedList<>();
        for (String numString:
                parts) {
            if (numString.startsWith(BR_START)) {
                numString = numString.substring(1);
            }

            if (numString.endsWith(BR_END)) {
                numString = numString.substring(0, numString.length() - 1);
            }

            if (numString.isEmpty()) {
                return null;
            }
            linkedList.add(Integer.valueOf(numString));

        }

        ListNode ret = new ListNode(linkedList.remove());
        ListNode rec = ret;
        while (!linkedList.isEmpty()) {
            rec.next = new ListNode(linkedList.remove());
            rec = rec.next;
        }

        return ret;
    }
}
