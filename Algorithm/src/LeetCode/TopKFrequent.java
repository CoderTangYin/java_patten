import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**

Top K 问题 -> 在一堆数据里面找到前 K 大（当然也可以是前 K 小）的数

输入: nums = [1,1,1,2,2,3], k = 2
输出: [1,2]
*/
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    	if (k > nums.length || k == 0) return nums;
    	List<Integer> list = new ArrayList<>();
    	// 小顶堆 堆顶会放最大元素
    	Queue<Integer> queue = new PriorityQueue<>();
    	for(int n: nums) {
    		// 让堆里有K个元素
    		if (queue.size() < k) {
    			queue.add(n);
    		} else if (queue.peek() < k) { // 如果当前堆里最大元素比当前元素大
    			queue.poll();
    			queue.add(n);
    		}
    	}
    	while(k-- > 0) {
    		list.add(queue.poll());
    	}
    	return null;
//    	return list;
    }

	public static void main(String[] args) {

	}
}