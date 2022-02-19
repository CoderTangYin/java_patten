package sort;

import java.util.Arrays;

public class BubbleSort {

     int[] array = {3,1,0,9,6,2};

     private void srort() {
        for (int end = array.length - 1; end > 0; end--) {
            // 假设原数据是排好序的
            boolean hasSorted = true;
            for (int begin = 1; begin <= end; begin++) {
                if (array[begin] < array[begin - 1]) {
                    int temp = array[begin];
                    array[begin] = array[begin -1];
                    array[begin - 1] = temp;
                    // 进入了交换证明原数据没有排好序
                    hasSorted = false;
                }
            }
            // 如果是已经排好的可以直接结束
            if (hasSorted) break;
        }
         System.out.println(Arrays.toString(array));
     }

    public static void main(String[] args) {
         new  BubbleSort().srort();
    }

}
