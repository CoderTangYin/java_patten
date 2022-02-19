package sort;

import java.util.Arrays;

/**
 * 快排
 */
public class QuickSort {

    int[] array = {3,1,0,9,6,2};

    public void sort() {
        sort(0, array.length);
        System.out.println(Arrays.toString(array));
    }

    private void sort(int begin, int end) {
        // 元素小于2个不用排序
        if (end - begin < 2) return;
        int mid = pivot(begin, end);
        sort(begin, mid);
        sort(mid + 1, end);
    }

    /**
     * 找轴点元素
     * @param begin
     * @param end
     * @return
     */
    private int pivot(int begin, int end) {
        // 备份轴点元素
        int pivot = array[begin];
        end--;
        while (begin < end) {
           while (begin < end) {
               if (pivot < array[end]) {
                   end--;
               } else {
                   array[begin] = array[end];
                   begin++;
                   break;
               }
           }
           while (begin < end) {
               if (pivot > array[begin]) {
                   begin++;
               } else {
                   array[end] = array[begin];
                   end--;
               }
               break;
           }
        }
        array[begin] = pivot;
        return begin;
    }


    public static void main(String[] args) {
            QuickSort quickSort = new QuickSort();
            quickSort.sort();
    }
}
