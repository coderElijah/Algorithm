package leetcode.interview;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: leetcode.interview
 * Date: 2019/4/5 22:39
 */
public class Reverse {
    public int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int p = x % 10;
            x /= 10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE && p > 7)) {
                return 0;
            }
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE && p < -8)) {
                return 0;
            }
            reverse = reverse * 10 + p;
        }
        return reverse;
    }
}
