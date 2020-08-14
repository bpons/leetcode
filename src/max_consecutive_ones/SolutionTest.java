package max_consecutive_ones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findMaxConsecutiveOnes() {
        int[] nums = {1,1,0,1,1,1};
        Solution s = new Solution();
        assertEquals(3, s.findMaxConsecutiveOnes(nums));
    }
}