package leetcode.diary;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: leetcode.diary
 * Date: 2019/4/23 16:55
 */
public class LeetCode026 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        int j = 0;
        while (j < nums.length && i < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {

                nums[++i] = nums[j++];
            }
        }
        return i + 1;
    }

    public static void main(String[] args){
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        new LeetCode026().removeDuplicates(nums);
    }
}
