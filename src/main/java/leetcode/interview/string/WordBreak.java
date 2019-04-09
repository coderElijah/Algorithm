package leetcode.interview.string;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Description:
 * 求解的问题可以分解为当前字符串的字串是否可以被合理分割为词典中的元素
 * 利用动态规划创建state状态数组，如果state[j]为1 则表示0-j已经被合理分割，那么j-i也可以被合理分割，那么0-i就被合理分割
 * 换句话说就是根据之前的分割状态推导出现在是否可以被合理分割，符合动态规划的特性
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: leetcode.interview
 * Date: 2019/4/9 16:31
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] state = new boolean[s.length() + 1];
        state[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (state[j] && wordDict.contains(s.substring(j, i))) {
                    state[i] = true;
                    break;
                }
            }
        }
        return state[state.length - 1];
    }

    public static void main(String[] args){
        List<String> list = new LinkedList<>();
        list.add("aaaa");
        list.add("aaa");
//        list.add("cats");
//        list.add("dog");
//        list.add("sand");
//        list.add("and");
//        list.add("cat");

        new WordBreak().wordBreak("aaaaaaa", list);
    }
}
