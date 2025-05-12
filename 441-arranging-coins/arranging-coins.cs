public class Solution {
    public int ArrangeCoins(int n) {
        int row = 0;
        while ( n >= row + 1) {
            row ++;
            n-=row;
        }
        return row;
    }
}