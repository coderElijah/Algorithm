package leetcode.interview;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: leetcode.interview
 * Date: 2019/4/4 16:15
 */
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[k - 1] = nums1[m - 1];
                --k;
                --m;
            }else{
                nums1[k - 1] = nums2[n - 1];
                --k;
                --n;
            }
        }
        while (n > 0) {
            nums1[k - 1] = nums2[n - 1];
            --k;
            --n;
        }
    }
}
