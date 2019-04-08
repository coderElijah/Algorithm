package leetcode.diary;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: leetcode.diary
 * Date: 2019/4/8 22:25
 */
public class LeetCode011 {
    public int maxArea(int[] height) {
        int maxValue = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int h = Math.min(height[i], height[j]);
                int len = j - i;
                maxValue = Math.max(h * len, maxValue);
            }
        }
        return maxValue;
    }

    public int maxArea2(int[] height){
        int left = 0;
        int right = height.length - 1;
        int maxValue = 0;
        while (left < right) {
            maxValue = Math.max(maxValue, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            }else{
                right--;
            }
        }
        return maxValue;
    }
}
