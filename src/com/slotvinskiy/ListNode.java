package com.slotvinskiy;

public class ListNode {

    int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentOrigin = head;
        ListNode distinct = new ListNode(head.val);
        ListNode currentDistinct = distinct;
        while (currentOrigin.next != null) {
            if (currentOrigin.val == currentOrigin.next.val) {
                currentOrigin = currentOrigin.next;
                continue;
            }
            currentDistinct.next = new ListNode(currentOrigin.next.val);
            currentDistinct = currentDistinct.next;
            currentOrigin = currentOrigin.next;
        }

        return distinct;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val + '}';
    }

    public String toStringFrom(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode current = head;
        sb.append("[");
        while (current.next != null) {
            sb.append(current.val).append(", ");
            current = current.next;
        }
        sb.append(current.val).append("]");
        return sb.toString();
    }
}

