package merge_sorted_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void merge() {
        Solution s = new Solution();

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        int[] expected = {1,2,2,3,5,6};
        s.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);

        int[] nums21 = {0};
        int m2 = 0;
        int[] nums22 = {1};
        int n2 = 1;
        int[] expected2 = {1};
        s.merge(nums21, m2, nums22, n2);
        assertArrayEquals(expected2, nums21);
    }
}