package two_sums;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void twoSum() {
        int[] input = {2,7,11,15};
        int[] expectedResult = {0, 1};
        Solution s = new Solution();
        int[] result = s.twoSum(input, 9);
        assertArrayEquals(expectedResult, result);
    }
}