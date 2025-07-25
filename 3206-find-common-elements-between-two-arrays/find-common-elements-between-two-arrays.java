import java.util.*;

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums2) set1.add(num);

        int count1 = 0;
        for (int num : nums1) {
            if (set1.contains(num)) count1++;
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) set2.add(num);

        int count2 = 0;
        for (int num : nums2) {
            if (set2.contains(num)) count2++;
        }

        return new int[]{count1, count2};
    }
}
