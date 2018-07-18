package structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Definition for singly-linked list.
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    // Helper functions for testing & printing
    public static ListNode toListNode(int[] arr) {
        ListNode extraHead = new ListNode(-1);
        ListNode curr = extraHead;

        for (int i : arr) {
            ListNode temp = new ListNode(i);
            curr.next = temp;
            curr = temp;
        }

        return extraHead.next;
    }

    public static int[] toArray(ListNode node) {
        List<Integer> result = new ArrayList<>();
        while (node != null) {
            result.add(node.val);
            node = node.next;
        }
        return result.stream().mapToInt(i->i).toArray();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof ListNode)) {
            return false;
        }

        return Arrays.equals(ListNode.toArray((ListNode)obj), ListNode.toArray(this));
    }
}