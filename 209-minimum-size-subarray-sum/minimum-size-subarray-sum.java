class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int minlength = Integer.MAX_VALUE;
        int sum = 0;
        

        for (int right = 0; right < nums.length ; right++) {
            
            sum += nums[right];
            while (sum >= target) {
                int cr = right-left+1;
                minlength = Math.min (minlength , cr);
                sum -= nums[left];
                left++;
            }
        }
        return minlength == Integer.MAX_VALUE ? 0 : minlength;
    }
}