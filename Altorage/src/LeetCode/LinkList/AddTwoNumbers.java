package LeetCode.LinkList;

/**
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        // 进位
        int carry = 0;
        while (l1 != null || l2 != null) {
            // 这里这样写是因为链表长度不一样的时候短的val可以用0补位
            int v1 = 0, v2 = 0;
            if (l1 != null) {v1 = l1.val; l1 = l1.next;}
            if (l2 != null) {v2 = l2.val; l2 = l2.next;}
            int sum = v1 + v2 + carry;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
