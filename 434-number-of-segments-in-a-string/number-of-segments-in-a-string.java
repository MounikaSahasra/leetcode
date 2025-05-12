class Solution {
    public int countSegments(String s) {
        String [] ans = s.split(" ");
        int count = 0;

        for (String i : ans) {
            if (!i.isEmpty()) {
                count ++;
            }
        }

        return count;
    }
}