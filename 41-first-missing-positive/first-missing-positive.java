class Solution {
    public int firstMissingPositive(int[] nums) {
        int j = 1;
        Arrays.sort(nums);
        for (int i : nums) {
            if (i == j){
                j++;
            }
        }
        return j;

    }
}