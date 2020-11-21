/**
 *
 */
public class SubSort {

	/**
	 * [1, 5, 4, 3, 2, 6, 7]
 	 * @param nums
	 * @return
	 */
	public int[] subSort(int[] nums) {

		int max = nums[0];
		int r = -1;
		for (int i = 0; i < nums.length; i++) {
			int v = nums[i];
			if (v >= max) {
				max = v;
			} else {
				r = i;
			}
		}

		int min = nums[0];
		int l = -1;
		for (int i = nums.length-2; i >= 0; i--) {
			int v = nums[i];
			if (v <= min) {
				min = v;
			} else {
				l = i;
			}
		}
		return new int[] {l, r};
	}

}