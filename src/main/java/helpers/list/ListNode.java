package helpers.list;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return Lists.serialize(this);
    }
}