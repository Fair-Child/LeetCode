import javax.xml.crypto.KeySelector.Purpose;

/*
 * @lc app=leetcode id=1822 lang=java
 *
 * [1822] Sign of the Product of an Array
 */

// @lc code=start
class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;

        for (int num:nums) {
            if (num == 0)
                return 0;
            if (num < 0)
                sign = -sign;
        }
        return sign;
    }
}
// @lc code=end

