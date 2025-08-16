class Solution {
    public int maxFreqSum(String s) {
        
        int [] freq = new int [26];
        for (int i : s.toCharArray()) {
            freq[i - 'a'] ++;
        }

        int vow = 0;
        int cons = 0;

        for (int i = 0; i< 26; i++) {
            char c = (char) (i + 'a');
            if (isVowel (c)) {
                vow = Math.max (vow, freq[i]);
            }
            else {
                cons = Math.max (cons, freq[i]);
            }
        }
        return vow + cons;
    }

    private boolean isVowel(char c) {
            return c == 'a' || c== 'e' || c== 'i' || c== 'o' || c== 'u';
        }
}