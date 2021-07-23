package LeetCode;

import java.util.*;
import java.lang.*;
/**

Top K 问题 -> 在一堆数据里面找到前 K 大（当然也可以是前 K 小）的数

输入: nums = [1,1,1,2,2,3], k = 2
输出: [1,2]
*/
class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
    	List<Integer> result = new LinkedList<>();
    	if (k > nums.length || k == 0) return result;
    	// 统计每个数字出现的次数
		Map<Integer, Integer> map = new HashMap<>();
		for (int num :nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(
				(Map.Entry<Integer, Integer> i1, Map.Entry<Integer, Integer> i2) -> {
					return i1.getValue() - i2.getValue();
				}
		);

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (priorityQueue.size() < k) {
				priorityQueue.offer(entry);
			} else if (entry.getValue() > priorityQueue.peek().getValue()) {
				// 堆顶的小鱼当前的 删除堆顶的 把当前的加进去 让堆里边始终保持2个是最大的
				priorityQueue.poll();
				priorityQueue.offer(entry);
			}
		}
		while (!priorityQueue.isEmpty()) {
			Map.Entry<Integer, Integer> entry = priorityQueue.poll();
			result.add(0, entry.getKey());
		}
		return result;
    }

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
	}
}