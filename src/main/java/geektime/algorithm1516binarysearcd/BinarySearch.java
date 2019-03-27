package geektime.algorithm1516binarysearcd;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: geektime.algorithm1516binarysearcd
 * Date: 2019/3/22 13:59
 */
public class BinarySearch {


    /**
     * 二分查找（循环）
     * @param a
     * @param n
     * @param value
     * @return
     */
    static int bsearch(int[] a,int n, int value) {
        if (n <= 0) {
            return -1;
        }
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if(a[mid]==value){
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 二分查找递归
     * @param a
     * @param n
     * @param value
     * @return
     */
    static int bsearch2(int[] a, int n, int value) {
        if (n <= 0) {
            return -1;
        }
        return bsearch2narlly(a, 0, n - 1, value);
    }
    static int bsearch2narlly(int[]a,int low ,int high,int value){
        if (low > high) {
            return -1;
        }
        int mid = low + ((high - low) >> 1);
        if (a[mid] == value) {
            return mid;
        } else if (a[mid] > value) {
            return bsearch2narlly(a, low, mid - 1, value);
        }else{
            return bsearch2narlly(a, mid + 1, high, value);
        }
    }

    /**
     * 查找第一个值等于给定值的元素
     *
     * @param a
     * @param value
     * @return
     */
    static int bsearchFirstEqual(int[] a, int n, int value) {
        if (n <= 0) {
            return -1;
        }
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if(a[mid]==value){
                if ((mid == 0) || a[mid - 1] != value) {
                    return mid;
                }else{
                    high = mid - 1;
                }

            }else if(a[mid]<value){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }


    /**
     * 查找第一个大于等于给定值的元素
     * @param a
     * @param n
     * @param value
     * @return
     */
    public int bsearchFirstGreater(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid =  low + ((high - low) >> 1);
            if (a[mid] >= value) {
                if ((mid == 0) || (a[mid - 1] < value)) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


    public static void  main(String[] args){
        int[] a = {8, 11, 19, 23, 27, 33, 45, 55, 67, 98};
        System.out.println(bsearch(a, a.length, 19));
        System.out.println(bsearch2(a, a.length, 55));
    }



}
