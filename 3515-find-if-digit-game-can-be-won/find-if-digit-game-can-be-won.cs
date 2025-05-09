public class Solution {
    public bool CanAliceWin(int[] nums) {
        int doubles = 0;
        int single = 0;
        foreach (int i in nums) {
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