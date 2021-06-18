

public void insertionSort(int[] nums) {

	for(int begin = 1; begin < nums.length; begin++) {
		insert(begin, search(begin));
	}
}

// 传入元素对应的索引idx 找出该元素在排好序的数组nums中待插入位置索引
public int search(int[] nums, int idx) {
	int begin = 0, end = idx;
	while (begin < end) {
		int mid = (begin + end) >> 1;
		if (nums[idx] < nums[mid]) {
			end = mid;
		} else {
			begin = mid + 1;
		}
	}
	return begin;
}

// 在区间【source，dest）插入nums[dest]
public void insert(int source, int dest, int[] nums) {
	int val = nums[source];
	for (int i=source; i > dest; i--) {
		nums[i] = nums[i-1];
	}
	nums[dest] = val;
}