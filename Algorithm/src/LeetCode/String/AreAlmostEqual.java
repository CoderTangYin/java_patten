package LeetCode.String;

/**
 * 仅执行一次字符串交换能否使两个字符串相等
 *
 * 示例 1：
 *
 * 输入：s1 = "bank", s2 = "kanb"
 * 输出：true
 * 解释：例如，交换 s2 中的第一个和最后一个字符可以得到 "bank"
 * 示例 2：
 *
 * 输入：s1 = "attack", s2 = "defend"
 * 输出：false
 * 解释：一次字符串交换无法使两个字符串相等
 */
public class AreAlmostEqual {

    public boolean areAlmostEqual(String s1, String s2) {
            if (s1.length() != s2.length()) return false;
            if (s1 == null || s2 == null) return false;
            if (s1.equals(s2)) return true;
            char[] sa = new char[2];
            char[] ta = new char[2];
            // 记录不同的次数超过了2 就不会是一次可以调换的了
            int difCount = 0;

            for (int i=0; i<s1.length(); i++) {
                char x = s1.charAt(i);
                char y = s2.charAt(i);
                if (x != y) {
                    if (difCount == 2) return false;
                    // 记录s1 s2的第一第二的不同字符
                    sa[difCount] = x;
                    ta[difCount] = y;
                    difCount += 1;
                }
            }
            return (sa[0] == ta[1] && sa[1] == ta[0]);
    }

    public static void main(String[] args) {
        AreAlmostEqual areAlmostEqual = new AreAlmostEqual();
        System.out.println(areAlmostEqual.areAlmostEqual("bank", "kanb"));
    }
}
