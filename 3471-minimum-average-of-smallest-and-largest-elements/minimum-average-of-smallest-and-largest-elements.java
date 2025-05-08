class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double avg = 0;
        double aver = Double.MAX_VALUE;
        int n = nums.length;
        for (int i = 0 ; i < n/2; i++) {
            avg = (nums[i] + nums[n-i-1]) / 2.0;
            aver = Math.min(avg,aver);
        }
        return aver;
    }
}