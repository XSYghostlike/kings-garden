// 2. Add Two Numbers

import structures.ListNode;

class Q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        Integer addOn = 0;
        Integer val1, val2;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                val1 = 0;
            } else {
                val1 = l1.val;
                l1 = l1.next;
            }

            if (l2 == null) {
                val2 = 0;
            } else {
                val2 = l2.val;
                l2 = l2.next;
            }
            Integer stepSum = val1 + val2 + addOn;
            curr.next = new ListNode(stepSum % 10);
            addOn = stepSum / 10;
            curr = curr.next;
        }

        if (addOn != 0) {
            curr.next = new ListNode(addOn);
        }

        return head.next;
    }
}
