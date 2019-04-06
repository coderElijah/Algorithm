package leetcode.diary;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: leetcode.diary
 * Date: 2019/4/6 21:13
 */
public class LeetCode013 {
    public int romanToInt(String s) {
        int i = 0;
        int sum = 0;
        while (i < s.length()) {
            int num = getNum(s.charAt(i));
            if (i + 1 < s.length()) {
                int num2 = getNum(s.charAt(i + 1));
                if (num < num2) {
                    sum += num2 - num;
                    i += 2;
                    continue;
                }
            }
            sum += num;
            i++;

        }
        return sum;
    }

    private int getNum(Character character) {
        switch (character) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
