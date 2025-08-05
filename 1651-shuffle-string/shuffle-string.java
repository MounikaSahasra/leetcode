class Solution {
    public String restoreString(String s, int[] indices) {
        char [] shuffled = s.toCharArray();
        char [] arranged = new char [s.length()];

        for (int i = 0; i < s.length(); i++) {
            arranged[indices[i]] = shuffled[i];
        }

        return new String(arranged);
    }
}