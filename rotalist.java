package Coding;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class rotalist {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            len++;
            tail = tail.next;
        }
        tail.next = head; // Make it a circular linked list

        k = len - k % len; // Calculate the actual rotation count

        for (int i = 0; i < k; i++) {
            tail = tail.next;
        }

        head = tail.next;
        tail.next = null;

        return head;
    }

    public static void main(String[] args) {
        rotalist solution = new rotalist();

        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;
        ListNode rotatedHead = solution.rotateRight(head, k);

        // Printing the rotated linked list
        while (rotatedHead != null) {
            System.out.print(rotatedHead.val + " ");
            rotatedHead = rotatedHead.next;
        }
    }
}
