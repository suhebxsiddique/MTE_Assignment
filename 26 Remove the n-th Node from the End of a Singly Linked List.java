public class Question26 {
    static class ListNode {
        int suheb1;
        ListNode next;
        ListNode(int x) { suheb1 = x; }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode suheb2 = new ListNode(0);
        suheb2.next = head;
        ListNode fast = suheb2, slow = suheb2;

        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return suheb2.next;
    }

    public static void main(String[] args) {
        ListNode suheb1 = new ListNode(1);
        suheb1.next = new ListNode(2);
        suheb1.next.next = new ListNode(3);
        suheb1.next.next.next = new ListNode(4);
        suheb1.next.next.next.next = new ListNode(5);

        ListNode result = removeNthFromEnd(suheb1, 2);
        while (result != null) {
            System.out.print(result.suheb1 + " ");
            result = result.next;
        }
    }
}
