package geektime.algorithm11sorts;

import java.util.Arrays;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: geektime.algorithm11sorts
 * Date: 2019/2/21 16:57
 */
public class QuickSort {
    public static void quickSort(int[] a, int n) {
        quickSortInternally(a, 0, n - 1);
    }

    private static void quickSortInternally(int[] a, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = partition(a, p, r);
        quickSortInternally(a, p, q - 1);
        quickSortInternally(a, q + 1, r);
    }

    private static int partition(int[] a, int p, int r) {
        int poivt = a[r];
        int i = p;
        for (int j = p; j < r; ++j) {
            if (a[j] < poivt) {
                if(j==i){
                    ++i;
                }else{
                    int temp = a[j];
                    a[j] = a[i];
                    a[i++] = temp;
                }
            }
            int temp = a[r];
            a[r] = a[i];
            a[i] = temp;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] a = {6, 11, 3, 9, 8};
        quickSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}
