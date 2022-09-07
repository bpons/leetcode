package remove_element;

import org.junit.jupiter.api.Test;

import java.rmi.server.ExportException;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeElement() {
        Solution s = new Solution();
        int[] nums = {3,2,2,3};
        int val = 3;
        int[] expected = {2,2,2,3};
        assertEquals(2, s.removeElement(nums, val));
        assertArrayEquals(expected, nums);
    }
}