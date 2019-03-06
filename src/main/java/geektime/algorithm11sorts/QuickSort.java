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
        int pivot = a[r];
        int i = p;
        int j = p;
        for (; j < r; ++j) {
            if (a[j] < pivot) {
                if (i == j) {
                    ++i;
                }else{
                    int temp = a[j];
                    a[j] = a[i];
                    a[i++] = temp;
                }
            }
        }
        int temp = a[i];
        a[i] = a[r];
        a[r] = temp;
        System.out.println("i=" + i);
        return i;
    }

    public static void main(String[] args) {
        int[] a = {6, 11, 3, 9, 8};
        quickSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}
