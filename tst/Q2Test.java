import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import structures.ListNode;

import static org.junit.Assert.*;

public class Q2Test {

    private Q2 q2;

    @BeforeEach
    void setUp() {
        q2 = new Q2();
    }

    @Test
    void tests() {
        assertEquals(ListNode.toListNode(new int[]{7,0,8}), q2.addTwoNumbers(ListNode.toListNode(new int[]{2,4,3}), ListNode.toListNode(new int[]{5,6,4})));
        assertEquals(ListNode.toListNode(new int[]{9,9,9}), q2.addTwoNumbers(ListNode.toListNode(new int[]{4,4,4}), ListNode.toListNode(new int[]{5,5,5})));
        assertEquals(ListNode.toListNode(new int[]{0}), q2.addTwoNumbers(ListNode.toListNode(new int[]{0}), ListNode.toListNode(new int[]{0})));
        assertEquals(ListNode.toListNode(new int[]{0}), q2.addTwoNumbers(ListNode.toListNode(new int[]{}), ListNode.toListNode(new int[]{0})));
        assertEquals(ListNode.toListNode(new int[]{}), q2.addTwoNumbers(ListNode.toListNode(new int[]{}), ListNode.toListNode(new int[]{})));
        assertEquals(ListNode.toListNode(new int[]{0,5}), q2.addTwoNumbers(ListNode.toListNode(new int[]{}), ListNode.toListNode(new int[]{0,5})));
        assertEquals(ListNode.toListNode(new int[]{0,0,0,1}), q2.addTwoNumbers(ListNode.toListNode(new int[]{1}), ListNode.toListNode(new int[]{9,9,9})));
        assertEquals(ListNode.toListNode(new int[]{9,0,0,1}), q2.addTwoNumbers(ListNode.toListNode(new int[]{0,1}), ListNode.toListNode(new int[]{9,9,9})));
    }
}