class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> mp = new HashSet <>();

        for (int i = 0; i < nums.length; i++) {
            if (!mp.contains(nums[i])){
                mp.add(nums[i]);
            }
            else {
                return true;
            }
        }
        return false;
    }
}