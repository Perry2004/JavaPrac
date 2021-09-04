public class MaximumAverageSubarray {
// Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/maximum-average-subarray-i
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public double findMaxAverage (int[] nums, int k) {
        double sum = 0.0;
        double maxSum;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum / k;
    }
}
