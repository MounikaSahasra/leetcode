class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        if (!word.matches("[A-Za-z0-9]+")) return false;

        boolean vow = false;
        boolean cons = false;
        String vowels = "aeiouAEIOU";

        // Rule 3 & 4: must have at least one vowel and consonant
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowels.indexOf(c) != -1) vow = true;
                else cons = true;
            }
        }

        return vow && cons;
    }
}
