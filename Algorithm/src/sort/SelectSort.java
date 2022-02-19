package sort;

import java.util.Arrays;

public class SelectSort {

    int[] array = {3,1,0,9,6,2};

    private void sort() {
        for (int end = array.length - 1; end > 0; end--) {
            // 每轮都默认第一个就是最大的值
            int maxIdx = 0;
            // 每轮循环结束后确定一个最值的索引
            for (int begin = 1; begin <= end; begin++) {
                if (array[maxIdx] < array[begin]) {
                    maxIdx = begin;
                }
            }
            int temp = array[end];
            array[end] = array[maxIdx];
            array[maxIdx] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
            SelectSort selectSort = new SelectSort();
            selectSort.sort();
    }
}
