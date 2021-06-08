package LeetCode.全排列;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Permute { // 全排列

    private List<List<Integer>> listResult;
    private int[] nums;
    /**
     * 记录每一层选择的数字
     */
    private int[] result;
    /**
     * 标记每一层的数字是否被用过
     */
    private boolean[] used;

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null) return null;
        listResult = new ArrayList<>();
        if (nums.length == 0) return listResult;
        result = new int[nums.length];
        used = new boolean[nums.length];
        this.nums = nums;
        dfs(0);
        return listResult;
    }

    private void dfs(int idx) {
        // 1. 到最底层的情况
        if (idx == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int n : result) { list.add(n); }
            listResult.add(list);
            return;
        }

        // 2. 枚举每一层的数字
        for (int i = 0; i < nums.length; i++) {
            // 当前层的数字被用过了直接跳过找下一个
            if (used[i]) continue;
            // 没用过把这个数放进这一层缓存数组，并标记为已经使用，进入下一层
            result[idx] = nums[i];
            used[i] = true;
            dfs(idx+1);
            // 下一层到底了又回到了这一层要复原可以使用状态
            used[i] = false;
        }

    }

    public static void main(String[] args) {
        Permute permute = new Permute();
        System.out.println(permute.permute(new int[]{1,2,3}));
    }
}


class Two {

    private List<List<Integer>> resultArray;
    private int[] nums;
    private List<Integer> result;

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null) return null;
        resultArray = new ArrayList<>();
        if (nums.length == 0) return resultArray;
        this.nums = nums;
        result = new ArrayList<>();
        dfs(0);
        return resultArray;
    }


    private void dfs(int idx) {
        if (idx == nums.length) {
            resultArray.add(new ArrayList<>(result));
        }

        for (int num :
                nums) {
            if (result.contains(num)) continue;
            result.add(num);
            dfs(idx+1);
            result.remove(result.size()-1);
        }
    }


    public static void main(String[] args) {

    }
}

class Three {

    private List<List<Integer>> resultArray;
    private int[] nums;

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null) return null;
        resultArray = new ArrayList<>();
        if (nums.length == 0) return resultArray;
        this.nums = nums;
        dfs(0);
        return resultArray;
    }


    private void dfs(int idx) {
        if (idx == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int n : nums) { list.add(n); }
            resultArray.add(list);
        }

        //
        for (int i = idx; i < nums.length; i++) {
            swap(idx, i);
            dfs(idx+1);
            swap(idx, i);
        }
    }


    private void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
        Three permute = new Three();
        System.out.println(permute.permute(new int[]{1,2,3}));
    }
}
