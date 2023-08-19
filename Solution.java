public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ptr1 = head;
        ListNode ptr2 = head;

        while (ptr1.next != null) {
            ptr1 = ptr1.next;
            if (ptr2.val != ptr1.val) {
                ptr2 = ptr2.next;
                ptr2.val = ptr1.val;
            }
        }
        ptr2.next = null;
        return head;
    }
}