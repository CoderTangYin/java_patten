
/**
 * 冒泡排序
 */
public void bubbleSort(int[] nums) {
	for (int end = nums.length - 1; end > 0; end--) {
		// 每次进入假定当前是已经排好序列的
		boolean sorted = true;
		for (int begin = 1; begin <= end; begin++) {
			// 后边跟前边的两两一比较
			if(nums[begin] < nums[begin - 1]) {
				int temp = nums[begin];
				nums[begin] = nums[begin - 1];
				nums[begin - 1] = temp;
				// 如果有一次进入了那就证明原始数据不是排好序的
				sorted = false;
			}
		}
		// 证明原始数据是排好序的 可以直接结束排序了
		if (sorted) {
			break;
		}
	}
}