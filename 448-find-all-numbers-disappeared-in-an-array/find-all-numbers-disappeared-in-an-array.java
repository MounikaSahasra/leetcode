class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List <Integer> nl = new ArrayList<>();
        int index;
        
        for (int i = 0; i< nums.length; i++) {
            index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
            nums[index] = -nums[index];
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] >= 0){
                nl.add(j+1);
            }
        }
        return nl;
    }
}