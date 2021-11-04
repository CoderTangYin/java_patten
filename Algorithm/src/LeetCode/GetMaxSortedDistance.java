package LeetCode;

/**
 * 求无序数组排序后的最大相邻差
 * [2,6,3,4,5,10,9]
 * [2,3,4,5,,6,9,10]
 * 最大为 9-6 == 3
 */
public class GetMaxSortedDistance {
    // 利用桶排序原理

    public int getMaxSortedDistance(int[] array) {

        // ① 找出最值
        int max = array[0];
        int min = array[0];
        for (int i = 1; i<array.length; i++) {
           max = array[i] > max ? array[i] : max;
           min = array[i] > min ? array[i] : min;
        }

        // ② 最值的最大差
        int d = max - min;
        if (d == 0) { return 0; };

        // ③ 初始化桶
        Bucket[] buckets = new Bucket[array.length];
        for (int i = 0; i < array.length; i++) {
            buckets[i] = new Bucket();
        }

        // ④ 把对应元素放进所属的桶内
        for (int i = 0; i < array.length; i++) {

            // 计算每个元素所属的桶下标
            int idx = ((array[i] - min) * buckets.length) / d;

            Bucket bck = buckets[idx];
            int cur = array[i];
            // 确定每个桶的最值
            if (bck.min == null || bck.min > cur) {
                bck.min = cur;
            }
            if (bck.max == null || bck.max < cur) {
                bck.max = cur;
            }
        }

        // ⑤ 求出每个桶的最大差值
        int leftMax = buckets[0].max;
        int maxDistance = 0;
        for (int i = 1; i < buckets.length; i++) {
            Bucket bck = buckets[i];
            if (bck.min == null) continue;
            // 后面桶的最小值-前面桶的最大值>最大值 符合条件
            if (bck.min - leftMax > maxDistance) {
                maxDistance = bck.min - leftMax;
            }
            leftMax = bck.max;
        }
        return maxDistance;
    }


    /**
     * 桶 用来存放每个桶的最大跟最小值
     */
    private class Bucket {
        Integer min;
        Integer max;
    }

}
