package find_peak_element;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findPeakElement() {
        int[] nums = {1, 2, 3, 1};
        Solution s = new Solution();
//        assertEquals(2, s.findPeakElement(nums));
        int[] nums2 = {1,2,1,3,5,6,4};
        List expected = Arrays.asList(1,5);
        assertTrue(expected.contains(s.findPeakElement(nums2)));
        int[] nums3 =  {-2147483648};
        assertEquals(0, s.findPeakElement(nums3));
    }
}