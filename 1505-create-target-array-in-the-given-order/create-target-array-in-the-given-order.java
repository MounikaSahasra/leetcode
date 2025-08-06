class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List <Integer> us = new ArrayList<>();
        int [] arr = new int [nums.length];
        for (int i= 0; i< nums.length; i++) {
            us.add(index[i] , nums[i]);
        }
        for (int i = 0; i< nums.length; i++) {
            arr[i] = us.get(i);
        }
        return arr;
    } 
}