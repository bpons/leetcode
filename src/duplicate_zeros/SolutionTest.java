package duplicate_zeros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void duplicateZeros() {
        Solution s = new Solution();
        int[] arr = {1,0,2,3,0,4,5,0};
        int[] expected = {1,0,0,2,3,0,0,4};
        s.duplicateZeros(arr);
        assertArrayEquals(expected, arr);
        int[] arr2 = {0,1,7,6,0,2,0,7};
        int[] expected2 = {0,0,1,7,6,0,0,2};
        s.duplicateZeros(arr2);
        assertArrayEquals(expected2, arr2);
        int[] arr3 = {8,4,5,0,0,0,0,7};
        int[] expected3 = {8,4,5,0,0,0,0,0};
        s.duplicateZeros(arr3);
        assertArrayEquals(expected3, arr3);
    }
}