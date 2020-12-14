package LeetCode;

/**
 * 输入: [2,0,2,1,1,0]
 * 输出: [0,0,1,1,2,2]
 */
public class SortColors {

    /**
     *
     * 把一个数组分成3部分 0放在左边 1放在中间 2放在右边
     *
     * 标记收尾元素 拿一个指针从头扫描  等于0让扫描的跟左边的交换  等于1 不动 扫描的跟左边指针
     * 都后移 大于1 拿扫描指针跟尾部交换
     *
     * @param nums
     */
    public void sortColors(int[] nums) {
        int i = 0, l = 0, r = nums.length - 1;
        while (i <= r) {
            int v = nums[i];
            if (v == 0) {
                swap(nums, i++, l++);
            } else if (v == 1) {
                i++;
            } else {
                swap(nums, i, r--);
            }
        }
    }

    private void swap(int[] nums, int i1, int i2) {
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }

    public static void main(String[] args) {
        SortColors sortColors = new SortColors();
        int[] arr = {2, 0, 2, 1, 1, 0};
        sortColors.sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
