class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap <Integer, Integer> hm = new HashMap<> ();

      for (int i=0; i<nums.length; i++) {
      int req_num = target - nums[i];
      if(hm.containsKey(req_num)) {
        int [] array = {hm.get(req_num) , i};
         return array ;
      }
      hm.put(nums[i], i);
        
    }
   return new int[]{};
}

}