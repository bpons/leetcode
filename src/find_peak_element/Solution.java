package find_peak_element;

import java.util.Arrays;

class Solution {

    //Linear scan
//    public int findPeakElement(int[] nums) {
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            if (max > nums[i])
//                return i-1;
//            else
//                max = nums[i];
//        }
//        return nums.length - 1;
//    }

    //binary search recursive
//    public int findPeakElement(int[] nums) {
//        return findPeak(nums, 0, nums.length -1);
//    }
//
//    private int findPeak(int[] nums, int l, int r) {
//      if (l == r)
//          return l;
//      int mid = (l + r) / 2;
//      if (nums[mid] > nums[mid + 1])
//          return findPeak(nums, 0, mid);
//      return findPeak(nums, mid+1, r);
//    }

    //binary search iterative
    public int findPeakElement(int[] nums) {
        int l =0;
        int r = nums.length -1;

        while (l != r) {
            int mid = l + ((r - l) / 2);
            if (nums[mid] > nums[mid +1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}
