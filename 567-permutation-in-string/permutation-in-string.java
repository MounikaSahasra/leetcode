public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] count1 = new int[26]; // frequency of s1
        int[] count2 = new int[26]; // frequency of sliding window in s2

        // Build frequency map for s1
        for (char c : s1.toCharArray()) {
            count1[c - 'a']++;
        }

        int windowSize = s1.length();

        // First window
        for (int i = 0; i < windowSize; i++) {
            count2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(count1, count2)) return true;

        // Slide the window
        for (int i = windowSize; i < s2.length(); i++) {
            count2[s2.charAt(i) - 'a']++;                 // add new char
            count2[s2.charAt(i - windowSize) - 'a']--;     // remove old char

            if (Arrays.equals(count1, count2)) return true;
        }

        return false;
    }
}
