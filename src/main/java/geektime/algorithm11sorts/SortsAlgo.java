package geektime.algorithm11sorts;

/**
 * Description:
 * 冒泡 插入 选择
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
            for (int j = 0; j < n - i - 1; j++) {
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
            for (;j >= 0; j--) {
                if (value < a[j]) {
                    a[j + 1] = a[j];
                }else{
                    break;
                }
            }
            a[j+1] = value;
        }
    }

    public static void selectionSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIdx];
            a[minIdx] = temp;
        }
    }

    public static void main(String[] args){
        int[] a = {4, 3, 2, 1, 6, 5};
//        bubbleSort(a, a.length);
//        insertSort(a, a.length);
        selectionSort(a, a.length);
        printAll(a);
    }

    public static void printAll(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

}
