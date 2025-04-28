public class Question13 {
    static class ListNode {
        int suheb1;
        ListNode next;
        ListNode(int x) { suheb1 = x; }
    }

    public static ListNode merge(ListNode suheb1, ListNode suheb2) {
        ListNode suheb3 = new ListNode(0);
        ListNode current = suheb3;

        while (suheb1 != null && suheb2 != null) {
            if (suheb1.suheb1 < suheb2.suheb1) {
                current.next = suheb1;
                suheb1 = suheb1.next;
            } else {
                current.next = suheb2;
                suheb2 = suheb2.next;
            }
            current = current.next;
        }

        if (suheb1 != null) {
            current.next = suheb1;
        } else {
            current.next = suheb2;
        }

        return suheb3.next;
    }

    public static void main(String[] args) {
        ListNode suheb1 = new ListNode(1);
        suheb1.next = new ListNode(2);
        suheb1.next.next = new ListNode(4);

        ListNode suheb2 = new ListNode(1);
        suheb2.next = new ListNode(3);
        suheb2.next.next = new ListNode(4);

        ListNode result = merge(suheb1, suheb2);

        while (result != null) {
            System.out.print(result.suheb1 + " ");
            result = result.next;
        }
    }
}
