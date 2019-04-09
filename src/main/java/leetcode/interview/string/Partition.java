package leetcode.interview.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: leetcode.interview
 * Date: 2019/4/9 15:10
 */
public class Partition {
    List<List<String>> listList = new ArrayList<>();
    public List<List<String>> partition(String s) {
        nextWords(s, 0, new ArrayList());
        return listList;
    }
    private void nextWords(String s, int index, List<String> list){
        if (index == s.length()) {
            listList.add(new ArrayList<String>(list));
        }
        for (int i = index; i < s.length(); i++) {
            String sub = s.substring(index, i + 1);
            if (isPalindrome(sub)) {
                list.add(sub);
                nextWords(s, i + 1, list);
                list.remove(list.size() - 1);
            }
        }

    }
    private boolean isPalindrome(String s) {
        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        (new Partition()).partition("aab");
    }
}
