package LeetCode;

/**
 *
 nums1 = [1,2,3,0,0,0], m = 3
 nums2 = [2,5,6],       n = 3

 输出：[1,2,2,3,5,6]
 */
public class MergeTwoArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m -1, i2 = n - 1, cur = nums1.length - 1;
        while (i2 >= 0) {
            if (i1 >= 0 && nums1[i1] > nums2[i2]) {
                nums1[cur--] = nums1[i1--];
            } else {
                nums1[cur--] = nums2[i2--];
            }
        }
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};

        MergeTwoArray mergeTwoArray = new MergeTwoArray();
        mergeTwoArray.merge(num1, 3, num2, 3);
        for (int i=0; i<num1.length; i++) {
            System.out.println(num1[i]);
        }
    }
}
