package LeetCode.Stack;

import java.util.Stack;

public class DailyTemperatures {

    /**
     *
     * 本质就是找数组里边某个元素右边第一个比它大的值
     *
     * 要想观测到更高的气温，至少需要等待的天数。如果气温在这之后都不会升高，请在该位置用 0 来代替。
     * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/daily-temperatures
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param T
     * @return
     */
    public int[] dailyTemperatures(int[] T) {
        if (T == null || T.length == 0) return null;
        int[] res = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int topIdx = stack.peek();
                res[topIdx] = i - topIdx;
//                [1, 0, 0, 0, 0, 0, 0, 0]
//                [1, 1, 0, 0, 0, 0, 0, 0]
//                [1, 1, 0, 0, 1, 0, 0, 0]
//                [1, 1, 0, 2, 1, 0, 0, 0]
//                [1, 1, 0, 2, 1, 1, 0, 0]
//                [1, 1, 4, 2, 1, 1, 0, 0]
//                System.out.println(Arrays.toString(res));
                stack.pop();
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        dailyTemperatures.dailyTemperatures(arr);
    }

}
