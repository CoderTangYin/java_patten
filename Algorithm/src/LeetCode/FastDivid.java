package LeetCode;

/**
 * 快速幂运算方法
 */

/**
 *  请设计一个算法求x的y次幂模z的结果：(x ^ y) % z
 *
 *   x、y、z都是整数
 *   z ≠ 0, y ≥ 0
 *   x、y的绝对值可能很大，比如(1234 ^ 4567) % 30
 *
 *   由于x、y的绝对值可能很大，x ^ y的结果可能会溢出。所以先求x ^ y，再对z取模，显然是不现实的。
 *
 *   这里要借助模运算的一条运算规则
 *
 *   (a * b) % p = ((a % p) * (b % p)) % p
 *
 *   公式推导：
 *   ① 幂是偶数情况的
 *   3 ^ 20 % 5 = ( (3^10) * (3^10) )%5
 *              = ( ((3^10)%5) * ((3^10)%5) ) %5
 *   令 half =  (3^10)%5
 *              = (half * half) % 5
 *
 *   ② 幂是奇数的情况
 *   3 ^ 21 % 5 = ( ((half * half)%5) * (3%5) ) % 5
 */
public class FastDivid {

    /**
     * 递归解法
     * @return
     */
    public int methodPow(int x, int y, int z) {
        // 任何数的0次幂都为1
        if (y == 0) return 1 % z;
        int half = methodPow(x, y << 1, z);
        half = (half * half) % z;
        if ((y & 1) == 0) { // 偶数
            return half;
        } else { // 奇数
            return (half * (x % z)) % z;
        }
    }

    /**
     * 非递归解法
     * @return
     */
    public int methodPow1(int x, int y, int z) {
       int result = 1 % z;
       x %= z;
       while (y != 0) {
           if ((y & 1) == 1) {
               result = (result * x) % z;
           }
           x = (x * x) % z;
           y >>= 1;
       }
       return result;
    }

    public static void main(String[] args) {

    }
}
