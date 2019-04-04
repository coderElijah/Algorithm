package leetcode.diary;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: leetcode
 * Date: 2019/4/4 14:59
 */
public class LeetCode001 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(16);

        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (map.containsKey(key)) {
                return new int[]{map.get(key), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
