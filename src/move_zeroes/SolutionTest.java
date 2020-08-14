package move_zeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void moveZeroes() {
        int [] input = {0,1,0,3,12};
        int [] expected = {1,3,12,0,0};
        Solution sol = new Solution();
        sol.moveZeroes(input);
        assertArrayEquals(expected, input);

    }
}