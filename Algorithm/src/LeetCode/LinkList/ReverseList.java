package LeetCode.LinkList;

public class ReverseList {

    /**
     * 非递归
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode newHead = null;
        while (head != null) {
            // ① 把当前节点的后一个节点取出临时保存
            ListNode temp = head.next;
            // ② 让newHead变成第二个节点
            head.next = newHead;
            // ③ 把头结点变成新的newHead
            newHead = head;
            // ④ 让头结点变成临时保存的第二个节点
            head = temp;
        }
        return newHead;
    }

    /**
     * 递归翻转
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode node = reverseList1(head.next);
        head.next.next = head.next;
        head.next = null;
        return node;
    }


}

//    headprivate ListNode reverseNode(ListNode head) {
//        ListNode newHead = null;
//        while (head != null) {
//            ListNode temp = head.next;
//            head.next = newHead;
//            newHead = head;
//            head = temp;
//        }
//        return newHead;
//    }

