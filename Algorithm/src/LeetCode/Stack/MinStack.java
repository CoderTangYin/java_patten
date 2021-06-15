package LeetCode.Stack;


// 利用链表的头插法 
public class MinStack {

    private Node head;

    public MinStack() {
        // 初始化一个头结点为 值为0 最小值执行最大的结点
        head = new Node(0,Integer.MAX_VALUE,null);
    }

    public void push(int x) {
        // 用插入的值跟头结点的最小值比对 取出最小值 创建写的结点 头插到最前边
        head = new Node(x, Math.min(x, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int min() {
        return head.min;
    }

    public static void main(String[] args) {

    }

    private static class Node {
        public int val;
        public int min;
        public Node next;
        public Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

    
}
