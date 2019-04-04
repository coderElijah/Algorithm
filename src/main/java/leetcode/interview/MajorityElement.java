package leetcode.interview;

import java.util.Arrays;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: leetcode.interview
 * Date: 2019/4/4 16:01
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        /**
         * 插入排序
         */
        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            int j = i - 1;
            for (; j >= 0; --j) {
                if (nums[j] < value) {
                    nums[j + 1] = nums[j];
                }else{
                    break;}
            }
            nums[j + 1] = value;
        }
        int mid = nums.length / 2;
        return nums[mid];
    }
}
