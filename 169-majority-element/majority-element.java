class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> pm = new HashMap <>();
        int n = nums.length;

        for (int i : nums) {
            pm.put(i, pm.getOrDefault(i, 0) + 1);
            if (pm.get(i) > n/2) {
                return i;
            }
        }
        return -1;
    }
}