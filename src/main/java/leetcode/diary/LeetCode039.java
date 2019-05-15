package leetcode.diary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: leetcode.diary
 * Date: 2019/5/15 16:52
 */
public class LeetCode039 {
    public List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        combination(0, candidates, new ArrayList<>(), target);
        return result;
    }
    private void combination(int i,int[] candidates,List<Integer> sumList,int target){
        if (target == 0) {
            result.add(new ArrayList<>(sumList));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int start = i; start < candidates.length; start++) {
            sumList.add(candidates[start]);
            combination(start, candidates, sumList, target - candidates[start]);
            sumList.remove(sumList.size() - 1);
        }
    }
}
