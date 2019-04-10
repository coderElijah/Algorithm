package leetcode.diary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * 深度优先遍历+回溯
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: leetcode.diary
 * Date: 2019/4/10 18:28
 */
public class LeetCode017 {
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits != null && digits.length() == 0) {
            return new ArrayList<>();
        }
        Map<Integer, String> letters = createLetters();
        List<String> res = new ArrayList<>();
        combine(digits, "", letters,res);
        return res;
    }

    private void combine(String digits, String temp, Map<Integer, String> letters,List<String> res) {
        if (digits.length() == 0) {
            res.add(temp);
            return;
        }

        Integer num = Integer.parseInt(digits.substring(0, 1));
        digits = digits.substring(1);
        String s = letters.get(num);
        for (int i = 0; i < s.length(); i++) {
            String node = temp + s.substring(i, i + 1);
            combine(digits, node, letters,res);
        }
    }
    public Map<Integer,String> createLetters() {
        Map<Integer, String> letters = new HashMap<>();
        letters.put(2, "abc");
        letters.put(3, "def");
        letters.put(4, "ghi");
        letters.put(5, "jkl");
        letters.put(6, "mno");
        letters.put(7, "pqrs");
        letters.put(8, "tuv");
        letters.put(9, "wxyz");
        return letters;
    }
}
