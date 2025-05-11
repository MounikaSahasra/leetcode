public class Solution {
    public int MaximumWealth(int[][] accounts) {
        int maxwealth = 0;

         foreach (int[] customer in accounts) {
            int currwealth = 0;
            foreach (int money in customer) {
                currwealth += money;
            }
            maxwealth = Math.Max(maxwealth, currwealth);
        }
        return maxwealth;
    }
}