package valid_mountain_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void validMountainArray() {
        Solution s = new Solution();
        int[] arr1 = {2,1};
        assertFalse(s.validMountainArray(arr1));
        int[] arr2 = {3,5,5};
        assertFalse(s.validMountainArray(arr2));
        int[] arr3 = {0,3,2,1};
        assertFalse(s.validMountainArray(arr3));


    }
}
