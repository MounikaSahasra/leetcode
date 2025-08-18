class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allow = new boolean [26];
        int count = 0;
        for (char i : allowed.toCharArray()) {
            allow[i - 'a'] = true;
        }

        for (String word : words) {
            boolean isco = true;
            for (char w : word.toCharArray()) {
                if (!allow[w-'a']) {
                    isco = false;
                    break;
                }
            }
            if (isco)
            count++;
        }
        return count;
    }
}