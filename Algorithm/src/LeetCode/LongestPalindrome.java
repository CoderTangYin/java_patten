package LeetCode;

/**
 * 最长回文子串
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 */
public class LongestPalindrome {

    /**
     * 添加分隔
     * @param olsCs
     * @return ^#b#a#b#a#d#$
     */
    private char[] preprocess(char[] olsCs) {
        char[] cs = new char[(olsCs.length << 1) + 3];
        cs[0] = '^';
        cs[1] = '#';
        cs[cs.length - 1] = '$';
        for (int i=0; i<olsCs.length; i++) {
            int index = (i + 1) << 1;
            cs[index] = olsCs[i];
            cs[index + 1] = '#';
        }
        return cs;
    }

    /**
     * 马拉车实现
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        if (s == null) return null;
        char[] oldCs = s.toCharArray();
        if (oldCs.length <= 1) return s;
        char[] cs = preprocess(oldCs);
        int[] m = new int[cs.length];
        return new String(cs);
    }

    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String s = longestPalindrome.longestPalindrome("babad");
        System.out.println(s);
    }
}
