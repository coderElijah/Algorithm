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
 * Date: 2019/4/4 15:14
 */
public class LeetCode003 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int result = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>(16);

        for (int i = 0, j = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            result = Math.max(result, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return result;
    }
}
