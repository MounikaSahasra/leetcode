class Solution {
    public int reverseDegree(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = 'z' - s.charAt(i) + 1;
            int ind = i+1;
            result += val * ind;
        }
        return result;
    }
}