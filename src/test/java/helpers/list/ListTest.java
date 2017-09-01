package helpers.list;

import org.junit.Assert;
import org.junit.Test;

public class ListTest {

    @Test
    public void listTest() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        Assert.assertEquals("[1,2,3,4]", head.toString());

        Assert.assertEquals(head, Lists.deserialize(head.toString()));
    }
}
