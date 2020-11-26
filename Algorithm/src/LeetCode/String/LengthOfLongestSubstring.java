package LeetCode.String;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    /**
     * 输入: "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null) return 0;
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        // 以i-1位置字符结尾的最长不重复字符串的开始索引
        int li;
        for (int i = 0; i < chars.length; i++) {
            Integer pi = map.get(chars[i]);
            
        }
    }
}
