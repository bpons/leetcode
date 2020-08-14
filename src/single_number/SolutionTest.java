package single_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void singleNumber1() {
        int [] input = {2,2,1};
        Solution sol = new Solution();
        int result = sol.singleNumber(input);
        assertEquals(1, result);
    }

    @Test
    void singleNumber2() {
        int [] input = {4,1,2,1,2};
        Solution sol = new Solution();
        int result = sol.singleNumber(input);
        assertEquals(4, result);
    }
}