package leetcode.diary;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: leetcode.diary
 * Date: 2019/4/15 21:59
 */
public class LeetCode018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new LinkedList<>();
        if (nums == null) {
            return list;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int newTarget = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j + 1]) {
                    continue;
                }
                int newTarget2 = newTarget - nums[j];
                int left = j + 1, right = nums.length - 1;
                while (left < right) {
                    if (nums[left] + nums[right] == newTarget2) {
                        list.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right++;
                        }
                        left++;
                        right++;
                    }else if(nums[left] + nums[right] <newTarget2){
                        left++;
                    }else{
                        right++;
                    }
                }

            }
        }
        return list;
    }
}
