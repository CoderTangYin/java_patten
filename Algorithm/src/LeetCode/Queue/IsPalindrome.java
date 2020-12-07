package LeetCode.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 是否回文串
 * 双端队列解法
 */
public class IsPalindrome {

    /**
     *
     * @param str
     * @return
     */
    public boolean isPalindrome(String str) {
        if (str == null) return false;
        if (str.length() == 1) return true;
        Deque<Character> queue = new ArrayDeque<>();
        char[] chars = str.toLowerCase().toCharArray();
        boolean res = true;
        for (int i = 0; i < chars.length; i++) {
            queue.offer(chars[i]);
        }
        // queue.size() > 1 是奇数的情况
        while (queue.size() > 1 && res) {
            char front = queue.pollFirst();
            char tail = queue.pollLast();
            if (front != tail) res = false;
        }
        return res;
    }

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome("radaR"));

    }
}