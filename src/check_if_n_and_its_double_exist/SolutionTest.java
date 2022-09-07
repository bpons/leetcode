package check_if_n_and_its_double_exist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void checkIfExist() {
        Solution s = new Solution();
        int[] nums = {10,2,5,3};
        assertTrue(s.checkIfExist(nums));
    }
}