package kth_largest_element_in_an_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findKthLargest() {
        int[] array = {3,2,1,5,6,4};
        Solution s = new Solution();

        assertEquals(5, s.findKthLargest(array, 2));

    }
}