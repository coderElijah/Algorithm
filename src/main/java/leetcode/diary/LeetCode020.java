package leetcode.diary;

import java.util.Stack;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: leetcode.diary
 * Date: 2019/4/10 18:12
 */
public class LeetCode020 {
    public boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (s.charAt(i) == ']' && stack.peek() == '[') {
                stack.pop();
            } else if (s.charAt(i) == '}' && stack.peek() == '{') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        new LeetCode020().isValid("()[]{}");
    }
}
