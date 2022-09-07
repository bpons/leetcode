package intersection_of_two_arrays;

import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void intersectionOfTwoArrays() {
        Solution s = new Solution();

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int [] expectedresult = {4,9};
        int [] result = s.intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(expectedresult, result);
    }
}