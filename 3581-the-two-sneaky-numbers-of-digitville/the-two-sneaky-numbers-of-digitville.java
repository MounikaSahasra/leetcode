class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set <Integer > set = new HashSet <>();
        List <Integer> res = new ArrayList<>();

        for (int num : nums) {
            if (!set.contains(num))
            set.add(num);
            else {
                res.add(num);
            }
        }
        int [] result = new int [res.size()];
        for (int i =0;  i<res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}