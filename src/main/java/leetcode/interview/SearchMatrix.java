package leetcode.interview;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: leetcode.interview
 * Date: 2019/4/4 16:08
 */

public class SearchMatrix {
    /**
     * [
     *   [1,   4,  7, 11, 15],
     *   [2,   5,  8, 12, 19],
     *   [3,   6,  9, 16, 22],
     *   [10, 13, 14, 17, 24],
     *   [18, 21, 23, 26, 30]
     * ]
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        if (n <= 0) {
            return false;
        }
        int m = matrix[0].length;
        int i = 0;
        int j = m - 1;
        while (i < n && j >= 0) {
            int value = matrix[i][j];
            if (target == value) {
                return true;
            } else if (target < value) {
                --j;
            }else{
                ++i;
            }
        }
        return false;
    }
}
