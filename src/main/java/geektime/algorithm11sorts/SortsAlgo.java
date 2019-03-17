package geektime.algorithm11sorts;

import java.util.Arrays;

/**
 * Description:
 * 冒泡 插入 选择 希尔
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: geektime.algorithm11sorts
 * Date: 2019/2/20 14:43
 */
public class SortsAlgo {
    public static void bubbleSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    public static void insertSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 1; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    public static void selectionSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }

    public static void shellSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        int step = n / 2;
        while (step >= 1) {
            for (int i = step; i < n; i++) {
                int value = a[i];
                int j = i - step;
                for (; j >= 0; j -= step) {
                    if (a[j] > value) {
                        a[j + step] = a[j];
                    } else {
                        break;
                    }
                }
                a[j + step] = value;
            }
            step /= 2;
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 3, 2, 1, 6, 5};
//        bubbleSort(a, a.length);
//        insertSort(a, a.length);
//        selectionSort(a, a.length);
        shellSort(a, a.length);
        System.out.print(Arrays.toString(a));
    }
}
