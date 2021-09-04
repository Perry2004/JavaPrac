public class TwoSum {
//     Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//      You may assume that each input would have exactly one solution, and you may not use the same element twice.
//      来源：力扣（LeetCode）
//      链接：https://leetcode-cn.com/problems/two-sum
//      著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public int[] twoSum (int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i + 1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] res = new int[2];
                    res[0] = (int)i;
                    res[1] =(int)j;
                    return res;
                }
            }
        }
        return new int[] {-1}; 
    }

    public static void main(String[] args) {
        int[] nums_ = new int[] {2, 7, 11, 15};
        TwoSum twosum = new TwoSum();
        twosum.twoSum(nums_, 9);
    }
}
