package LeetCode.全排列;

import java.util.ArrayList;
import java.util.List;

/**
 * n 代表生成括号的对数
 *
 * 示例 1：
 *
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 * 示例 2：
 *
 * 输入：n = 1
 * 输出：["()"]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/generate-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        dfs(0, n, n, new char[n<<1], list);
        return list;
    }

    private void dfs(int idx, int leftRemain, int rightRemain ,char[] string, List<String> list) {
        if (idx == string.length) {
            list.add(new String(string));
            return;
        }

        if (leftRemain > 0) {
            string[idx] = '(';
            dfs(idx+1, leftRemain-1, rightRemain, string, list);
        }

        if (rightRemain > 0 && leftRemain != rightRemain) {
             string[idx] = ')';
             dfs(idx+1,leftRemain, rightRemain-1, string, list);
        }

    }

    public static void main(String[] args) {
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        System.out.println(generateParenthesis.generateParenthesis(3));
    }
}
