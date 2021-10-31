package LeetCode;

public class FibonacciSequence {

    /**
     * 递归缓存方法求解
     * @param n
     * @return
     */
    public int fib(int n) {
        if (n <= 2) return 1;
        // 缓存递归计算的重复结果
        int[] arr = new int[n + 1];
        // 默认的第一个第二个数是1
        arr[1] = arr[2] = 1;
        return fib(n, arr);
//        for (int i = 3; i < n; i++) {
//            arr[i] = arr[i-1] + arr[i-2];
//        }
    }

    public  int fib(int n, int[] arr) {
        // n的计算结果进行缓存
        if (arr[n] == 0) {
            arr[n] = fib(n - 1, arr) + fib(n - 2, arr);
        }
        // 返回当前的计算结果
        return arr[n];
    }

    /**
     * 滚动数组 方法求解
     * @param n
     * @return
     */
    public int fib1(int n) {
        if (n <= 2) return 1;
        int[] arr = new int[n + 1];
        arr[1] = arr[2] = 1;
        for (int i = 3; i <= n; i++) {
            arr[i%2] = arr[(i - 1)%2] + arr[(i-2)%2];
        }
        return arr[n % 2];
    }


    public int fib2(int n) {
        if (n <= 2) return 1;
        int first = 1;
        int second = 1;
        for (int i = 3; i <= n ; i++) {
            second = first + second;
            first = second - first;
        }
        return second;
    }



    public static void main(String[] args) {

    }
}




