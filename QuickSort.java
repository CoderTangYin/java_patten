
int[] arr = {2,6,3,1,9,0};

private void sort(int begin, int end) {
	if (end - begin < 2) return;
	int mid = pivotIndex(begin, end);
	sort(begin, mid);
	sort(mid + 1, end);
}

private int pivotIndex(int begin, int end) {
	int v = arr[begin];
	end--;
	while (begin < end) {
		while (begin < end) {
			if (v < arr[end]) {
				end--;
			} else {
				arr[begin++] = arr[end];
				break;
			}
		}
		while(begin < end) {
			if (v < arr[begin]) {
				begin++;
			} else {
				arr[end--] = arr[begin];
				break;
			}
		}
	}
	arr[begin] = v;
	return begin;
}