public class Solution {
    public int FindClosest(int x, int y, int z) {
        int ans1 = Math.Abs(z - x);
        int ans2 = Math.Abs(z - y);

        if (ans1 < ans2) return 1;
        if (ans2 < ans1) return 2;
        return 0;
    }
}