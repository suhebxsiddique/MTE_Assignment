public class Question27 {
    static class ListNode {
        int suheb1;
        ListNode next;
        ListNode(int x) { suheb1 = x; }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode suheb1 = headA, suheb2 = headB;

        while (suheb1 != suheb2) {
            suheb1 = (suheb1 == null) ? headB : suheb1.next;
            suheb2 = (suheb2 == null) ? headA : suheb2.next;
        }

        return suheb1;
    }

    public static void main(String[] args) {
        ListNode suheb1 = new ListNode(1);
        suheb1.next = new ListNode(2);
        ListNode suheb2 = new ListNode(3);
        suheb2.next = new ListNode(4);
        ListNode suheb3 = new ListNode(5);
        suheb1.next.next = suheb3;
        suheb2.next.next = suheb3;

        ListNode result = getIntersectionNode(suheb1, suheb2);
        System.out.println("Intersection Node: " + (result != null ? result.suheb1 : "None"));
    }
}
