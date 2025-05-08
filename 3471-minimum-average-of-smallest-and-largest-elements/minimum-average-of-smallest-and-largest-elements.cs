public class Solution {
    public double MinimumAverage(int[] nums) {
        if (nums == null || nums.Length == 0) return 0;
        Array.Sort(nums);

        double avg = 0;
        double minavg = double.MaxValue;
        int n = nums.Length;
        for (int i = 0; i < n / 2; i++) {
            avg = (nums[i] + nums[n - i - 1]) / 2.0;
            minavg = Math.Min(avg, minavg);
        }
        return minavg;
    }
}