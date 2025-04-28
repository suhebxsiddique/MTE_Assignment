public class Question49 {
    public static ListNode getIntersectionNode(ListNode suheb1, ListNode suheb2) {
        if (suheb1 == null || suheb2 == null) return null;
        ListNode temp1 = suheb1, temp2 = suheb2;

        while (temp1 != temp2) {
            temp1 = (temp1 == null) ? suheb2 : temp1.next;
            temp2 = (temp2 == null) ? suheb1 : temp2.next;
        }
        return temp1;
    }

    public static void main(String[] args) {
        ListNode suheb1 = new ListNode(4);
        suheb1.next = new ListNode(1);
        suheb1.next.next = new ListNode(8);
        suheb1.next.next.next = new ListNode(4);
        suheb1.next.next.next.next = new ListNode(5);

        ListNode suheb2 = new ListNode(5);
        suheb2.next = new ListNode(6);
        suheb2.next.next = new ListNode(1);
        suheb2.next.next.next = suheb1.next.next;

        System.out.println("Intersection Node: " + getIntersectionNode(suheb1, suheb2).val);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
