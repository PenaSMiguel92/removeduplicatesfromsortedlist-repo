public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode list1 = generateListFromValues(new int[] { 1, 1, 2 });
        ListNode list2 = generateListFromValues(new int[] { 1, 1, 2, 3, 3 });
        ListNode list3 = generateListFromValues(new int[] { -30, -230, 20, 140, 500 });

        printList(sol.deleteDuplicates(list1));
        printList(sol.deleteDuplicates(list2));
        printList(sol.deleteDuplicates(list3));
    }

    public static ListNode generateListFromValues(int[] values) {
        ListNode head = new ListNode(-1, null);
        ListNode pointer = head;
        for (int val : values) {
            pointer.next = new ListNode(val);
            pointer = pointer.next;
        }
        return head.next;
    }

    public static void printList(ListNode list) {
        String val = "[";
        while (list != null) {
            val += list.val;
            list = list.next;
        }
        System.out.println(val + "]");
    }
}