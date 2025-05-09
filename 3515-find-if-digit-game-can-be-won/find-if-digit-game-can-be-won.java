class Solution {
    public boolean canAliceWin(int[] nums) {
        int doubles = 0;
        int single = 0;
        for (int i : nums) {
            if ( i < 10) {
                single += i;
            }
            else {
                doubles += i;
            }
        }
    return single!=doubles;
    }
}