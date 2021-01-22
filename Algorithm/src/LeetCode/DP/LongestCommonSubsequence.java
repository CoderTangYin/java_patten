package LeetCode.DP;

import java.util.ArrayList;
import java.util.List;

/**
 * 最长公共子序列
 */
public class LongestCommonSubsequence {

    public static void main(String[] args) {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
         int len =lcs.longestCommonSubsequence(new int[] {1,3,5,9,10}, new int[] {1,4,9,10});
//        System.out.println(len);
    }

    public int longestCommonSubsequence(int[] nums1, int[] nums2) {
       return lcs(nums1, nums1.length, nums2, nums2.length);
    }

    /**
     * nums1的前i个元素跟nums2的前j个元素的最长公共子序列
     * @param nums1
     * @param i
     * @param nums2
     * @param j
     * @return
     */
    public int lcs(int[] nums1, int i, int[] nums2, int j) {
        if (i == 0 || j == 0) return 0;
        if (nums1[i-1] == nums2[j-1]) {
            System.out.println(nums1[i - 1]);
            return lcs(nums1, i-1, nums2,j-1) + 1;
        }
        return Math.max(lcs(nums1, i-1, nums2,j),
                        lcs(nums1, i, nums2, j-1));
    }

}
