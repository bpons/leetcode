package search_insert_position;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void searchInsert() {
        Solution s = new Solution();
        int [] nums = {1,3,5,6};
        int target = 5;
        assertEquals(2, s.searchInsert(nums, target));
        target = 2;
        assertEquals(1, s.searchInsert(nums, target));
        target = 7;
        assertEquals(4, s.searchInsert(nums, target));
        int [] nums2 = {1,3,5};
        target = 1;
        assertEquals(0, s.searchInsert(nums2, target));


    }
}