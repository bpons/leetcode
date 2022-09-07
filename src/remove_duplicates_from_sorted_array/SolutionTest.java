package remove_duplicates_from_sorted_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeDuplicates() {
        Solution s = new Solution();
        int[] nums = {1,1,2};
        int[] expected = {1,2,2};
        assertEquals(2, s.removeDuplicates(nums));
        assertArrayEquals(expected, nums);
    }
}