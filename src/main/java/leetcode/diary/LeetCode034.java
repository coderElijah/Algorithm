package leetcode.diary;

import java.util.Arrays;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: leetcode.diary
 * Date: 2019/5/5 14:13
 */
public class LeetCode034 {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int[] res = new int[]{-1, -1};
        return search(res,nums, target, 0, nums.length - 1);
    }

    private int[] search(int[] res, int[] nums, int target, int low, int high) {
        if (low > high) {
            return res;
        }
        int mid = low + ((high - low) >> 1);
        if (nums[mid] == target) {
            if ((mid > 0 && nums[mid - 1] == target)) {
                if (res[0]==-1||mid - 1 < res[0]) {
                    search(res,nums, target, low, mid - 1);
                }
            }
            if (mid < nums.length - 1 && nums[mid + 1] == target) {
                if (res[0]==-1||mid + 1 > res[1]) {
                    search(res, nums, target, mid + 1, high);
                }
            }
            if (mid == 0 || (mid > 0 && nums[mid - 1] != target)) {
                res[0] = mid;
            }
            if (mid == nums.length - 1 || (mid < nums.length - 1 && nums[mid + 1] != target)) {
                res[1] = mid;
            }
            return res;
        } else if (nums[mid] < target) {
            return search(res,nums, target, mid + 1, high);
        } else {
            return search(res,nums, target, low, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int[] res = new LeetCode034().searchRange(arr, 8);
        System.out.println(Arrays.toString(res));
    }
}
