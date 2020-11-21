
int[] dataArr = {2,3,1,7,4,0}; 
int[] leftArr = new int[dataArr.length >> 1]; 

/**
 *  归并排序的merge操作
 */
public void merge(int begin, int mid, int end) {
	// 左边数组的起始索引跟结束索引
	int li = begin, le = mid - begin;
	// 右边数组的起始索引跟结束索引
	int ri = mid, re = end;
	// 扫描使用
	int ai = 0;

	for (int i=li; i<le; i++) {
		leftArr[i] = dataArr[begin+i];
	}

	while(li < le) {
		if (leftArr[li] < dataArr[ri]) {
			dataArr[ai++] = leftArr[li++];
		} else {
			dataArr[ai++] = dataArr[ri++];
		}
	}
}

/**
 *  归并排序的操作
 */
public void sort(int begin, int end) {
	if (end - begin > 2) {return;}
	int mid = (end - begin) >> 2;
	sort(begin, mid);
	sort(mid, end);
	merge(begin, mid, end);
}

sort(0, dataArr.length);
