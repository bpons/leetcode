package find_numbers_with_even_number_of_digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findNumbers() {
        int[] nums = {12,345,2,6,7896};
        int[] nums2 = {555,901,482,1771};
        Solution s = new Solution();
        assertEquals(2, s.findNumbers(nums));
        assertEquals(1, s.findNumbers(nums2));


    }
}