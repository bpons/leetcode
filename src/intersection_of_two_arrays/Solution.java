package intersection_of_two_arrays;

import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> result = new HashSet<>();
        int runner1 = 0;
        int runner2 = 0;

        while (runner1 < nums1.length && runner2 < nums2.length) {
                if(nums1[runner1] == nums2[runner2]) {
                    result.add(nums1[runner1]);
                    runner1++;
                    runner2++;
                } else if(nums1[runner1] < nums2[runner2]){
                    runner1++;
                } else {
                    runner2++;
                }
        }

        return result.stream().mapToInt(n -> n).toArray();
    }
}
