/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
package leetcode;
class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int label = 0;
        for(int numb:nums) {
            if(numb != val) {
                nums[label] = numb;
                label++;
            }
        }
        return label;
    }
}
// @lc code=end

