package leetcode.diary;

/**
 * Description:
 * 其实这个问题的核心问题就是二分之后需要判断哪一部分是无序的，因为二分查找过程中只会判断中点与target的大小关系，如果不判断有序无序那么有可能会碰到略过的情况
 * 例如3456712 需要查找的target=7，那么第一次中分会变为，345 6 712，那么第二次在进行中分的时候 会分为 7 1 2 那么target7>1 按照二分 会去右边的序列查找 那么就会错过
 * 左边含有7的数列。
 * 所以解决办法就是在判断出有序的数列之后 如果target不存在与该序列中，应该将无序数列继续进行递归二分查找
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: leetcode.diary
 * Date: 2019/4/24 16:32
 */
public class LeetCode033 {
    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    private int search(int[] nums, int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        //一个旋转点 则数组一分为二时必然有一个半有序
        //若nums[mid]<nums[high] 那么说明mid～high是有序的那么按照二分查找的方法来查
        if (nums[mid] < nums[high]) {
            //若target在mid～high之中，并且target不大于nums[high]（因为mid～high是有序的，如果target>nums[high]那么不会存在于mid～high），按照二分查找target
            if (nums[mid] < target && target <= nums[high]) {
                return search(nums, mid + 1, high, target);
            } else {
                //否则查找无序的部分
                return search(nums, low, mid - 1, target);
            }
        } else {
            //如果mid～high无序
            //那么low～mid有序 同样如果target小于low则不存在于low～mid中 若不小于low 则二分查找
            if (nums[low] <= target && target < nums[mid]) {
                return search(nums, low, mid - 1, target);
            } else {
                //查找无序部分
                return search(nums, mid + 1, high, target);
            }
        }
    }

}
