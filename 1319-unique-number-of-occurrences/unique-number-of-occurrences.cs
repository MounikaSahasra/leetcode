public class Solution {
    public bool UniqueOccurrences(int[] arr) {
        Dictionary <int, int> map = new  Dictionary <int, int> ();
        foreach (int num in arr) {
           if (map.ContainsKey(num)) {
            map[num]++;
           }
           else {
            map[num] = 1;
           }
        }
        HashSet <int> occur = new HashSet <int> ();
        foreach ( int freq in map.Values) {
           if (!occur.Add(freq)) {
            return false;
           }
        }
        return true;
    }
}