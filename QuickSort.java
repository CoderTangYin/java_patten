
class QuickSort {

	public int[] arr = {2,6,3,1,9,0};

	private void sort(int begin, int end) {
		if (end - begin < 2) return;
		int mid = pivotIndex(begin, end);
		sort(begin, mid);
		sort(mid + 1, end);
	}

	/**
	 *  原理： ① 取出一个轴点元素
	 *		 ② 用begin位置的跟轴点比较 大于轴点的begin跟end位置的交换 结束蹦本次循环
	 *           小于的begin++
	 *		 ③ 用end位置的跟轴点比较 小于轴点的 end-- 大于的end跟begin交换 结束本次循环
	 */
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

	public static void main(String[] args) {

		QuickSort quickSort = new QuickSort();
		quickSort.sort(0, arr.length());

	}
}

