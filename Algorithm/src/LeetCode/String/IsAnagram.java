package LeetCode.String;

/**
 * 有效的字母异位词
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "rat", t = "car"
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-anagram
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 本质是2个字符串的字符次数是否相同
 *
 * 统计字符出现次数 有2种方式：
 *      ①使用HashMap
 *      ②利用桶排序原理统计字符次数 本题采用这一种解法
 *
 */
public class IsAnagram {

    /**
     *
     * 利用ASCII码值
     *
     * 'a' - 'a' = 0; 即为a的数组索引是0 放a出现的次数
     * 'b' - 'a' = 1; 即为a的数组索引是1 放b出现的次数
     *  以此类推 知道z的索引 'z' - 'a' = 25;
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            // 利用上边统计的次数做减法操作 如果小于0则证明有一个字符出现的次数
            // 是不一样的 如某个字符没出现 counts[t.charAt(i) - 'a'] 取出的
            // 值为0  --0 就是<0的了
            if (--counts[t.charAt(i) - 'a'] < 0) return false;
        }
        return true;
    }
}
