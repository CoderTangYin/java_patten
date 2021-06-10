
/**
 * 选择排序
 */
public selectedSort(int[] nums) {
	for (int end = nums.length - 1; end > 0; end--) {
		// 假定每轮第一都是最大的 从头到尾都结束的时候就能确定出一个最大的
		// 全部结束的时候就已经排好序了
		int maxIdx = 0;
		for (int begin = 1; begin <= end; begin++) {
			if(nums[maxIdx] < nums[begin]) {
				maxIdx = begin;
			}
		}
		int temp = nums[maxIdx]
		nums[maxIdx] = nums[end]
		nums[end] = temp
	}
}