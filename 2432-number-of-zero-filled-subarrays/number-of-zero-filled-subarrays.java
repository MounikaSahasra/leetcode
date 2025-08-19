class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long curr = 0;
        long res = 0;
        for (int n : nums) {
            if (n == 0) {
                curr ++;
                res += curr;
            }
            else {
                curr = 0;
            }


        }
        return res;
    }
}