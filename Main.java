public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

    }

    public ListNode generateListFromValues(int[] values) {
        ListNode head = new ListNode(-1, null);
        ListNode pointer = head;
        for (int val : values) {
            pointer.next = new ListNode(val);
            pointer = pointer.next;
        }
        return head.next;
    }
}