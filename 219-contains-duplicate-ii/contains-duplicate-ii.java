class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         HashSet <Integer> mp = new HashSet ();
         for (int i = 0; i< nums.length; i++) {
            if (mp.contains(nums[i])) {
                return true;
            }
            else {
                mp.add(nums[i]);
            }

            if (mp.size() > k)
             mp.remove(nums[i-k]);
         }
         return false;
    }
}