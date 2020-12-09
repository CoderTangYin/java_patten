package LeetCode;

/**
 * 给定2个比较大的数值字符串 计算相加的结果跟2个链表相加有些类似
 *
 * int v = '1' - '0';
 */
public class AddStrings {

    public String addStrings(String num1, String num2) {
        if (num1 == null || num2 == null) return null;
        if (num1.length() == 0 && num2.length() != 0) return num2;
        if (num2.length() == 0 && num1.length() != 0) return num1;
        if (num1.length() == 0 && num2.length() == 0) return null;

        StringBuilder stringBuilder = new StringBuilder();
        int carry = 0, num1Length = num1.length()-1, num2Length = num2.length()-1;
        // 任意一个字符串的长度没结束 并且进位值不是0
        while (num1Length >= 0 || num2Length >= 0 || carry != 0) {
            if (num1Length >= 0) carry += num1.charAt(num1Length--) - '0';
            if (num2Length >= 0) carry += num2.charAt(num2Length--) - '0';
            // 2个数相加的结果 分为小于10跟大于10的情况    比如9%10为9  9/10为0   12%10为2 12/10为1
            stringBuilder.append(carry%10);
            carry /= 10;
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        AddStrings addStrings = new AddStrings();
        String s1 = "1234", s2 = "1234";
        System.out.println(addStrings.addStrings(s1, s2));

        System.out.println();

    }
}
