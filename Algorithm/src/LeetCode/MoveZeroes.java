package LeetCode;

/**
 * 把0移动到数组最后
 */
public class MoveZeroes {

    /**
     * 输入: [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int cur = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) continue;
            if (cur != j) {
                nums[cur] = nums[j];
                nums[j] = 0;
                cur++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] arr = new int[]{0,1,0,3,12};
        moveZeroes.moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
