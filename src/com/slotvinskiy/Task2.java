package com.slotvinskiy;

//2*) Задан отсортированный список который состоит из ListNode.
//Написать метод deleteDuplicates, который вернет список без дубликатов.
//* public class ListNode {
//* int val;
//* ListNode next;
//* ListNode(int x) { val = x; }
//* }
//public ListNode deleteDuplicates(ListNode head) { ...}
//Example:
//Input: 1->1->2->3->3
//Output: 1->2->3

public class Task2 {

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(1);
        list.next.next = new ListNode(2);
        list.next.next.next = new ListNode(3);
        list.next.next.next.next = new ListNode(3);

        ListNode distinct = list.deleteDuplicates(list);
        System.out.println(list.toStringFrom(list));
        System.out.println(list.toStringFrom(distinct));
    }

}
