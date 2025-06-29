class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int result =0;
        for (int i=0; i<= x/2; i++) {
            if ((long)i*i <= x) {
                result = i;
            }
            else {
                break;
            }
        }
        return result;
    }
}