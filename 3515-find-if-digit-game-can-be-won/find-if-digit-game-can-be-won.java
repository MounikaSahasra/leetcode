class Solution {
    public boolean canAliceWin(int[] nums) {
        int doubles = 0;
        int single = 0;
        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] < 10) {
                single += nums[i];
            }
            else {
                doubles += nums[i];
            }
        }
    return single!=doubles;
    }
}