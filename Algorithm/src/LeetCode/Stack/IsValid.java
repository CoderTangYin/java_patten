package LeetCode.Stack;

import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {
        // 奇数不会符合要求
        if (s == null || s.trim().length() % 2 != 0) return false;
        char[] carr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (Character c :
                carr) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                // 执行到这里的情况是右括号的情况
                // 1. 栈为空，该右括号无法构成闭合
                // 2. 弹栈并判断是否是预期的右括号
                return false;
            }
        }
        // 栈为空表示都匹配完毕且符合要求
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        IsValid isValid = new IsValid();
        System.out.println(isValid.isValid("{[]}"));
    }
}
