package leetcode.interview;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: leetcode.interview
 * Date: 2019/4/4 17:14
 */
public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int startIndex = 0;
        int endIndex = s.length() - 1;
        while (startIndex < endIndex && startIndex < s.length() - 1) {
            char pre = s.charAt(startIndex);
            char aft = s.charAt(endIndex);
            if (!((pre >= 'a' && pre <= 'z') || (pre >= '0' && pre <= '9'))) {
                startIndex++;
                continue;
            }
            if (!((aft >= 'a' && aft <= 'z') || (aft >= '0' && aft <= '9'))) {
                endIndex--;
                continue;
            }

            if (pre != aft) {
                return false;
            }
            startIndex++;
            endIndex--;
        }

        return true;
    }

    public static void main(String[] args){
        isPalindrome("A man, a plan, a canal: Panama");
    }
}
