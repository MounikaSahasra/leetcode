public class Solution {
    public bool ThreeConsecutiveOdds(int[] arr) {
        int i = 0;
        int n = arr.Length;
        while (i < n-2) {
            if (arr[i] % 2 != 0 && arr[i+1] % 2 != 0 && arr[i+2] % 2 != 0) 
            return true;
            i++;
        }
        
        return false;
    }
}