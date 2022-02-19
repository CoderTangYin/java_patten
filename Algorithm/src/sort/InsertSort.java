package sort;

import java.util.Arrays;

public class InsertSort {
    int[] array = {3,1,0,9,6,2};
    private void srort() {
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            // 后边的某个元素比前边的小
            if (array[i] < array[i-1]) {
                // 备份后边这小的元素
                temp = array[i];
                // 确定从0开始到这个最小元素的区间
                for (int j = i; j >= 0 ; j--) {
                    // 这个区间的所有比后边元素大的统一向后边移动
                    if ( j > 0 && array[j - 1] > temp) {
                        array[j] = array[j - 1];
                    } else {
                        // 找个最小元素要插入的位置
                        array[j] = temp;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        new InsertSort().srort();
    }
}
