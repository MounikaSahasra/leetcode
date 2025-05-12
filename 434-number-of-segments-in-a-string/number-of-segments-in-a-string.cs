public class Solution {
    public int CountSegments(string s) {
        String [] ans = s.Split(' ');
        int count = 0;

        foreach (String i in ans) {
            if (!string.IsNullOrEmpty(i)) {
                count ++;
            }
        }

        return count;   
    }
}