package squares_of_a_sorted_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sortedSquares() {
        int[] input1 = {-4,-1,0,3,10};
        int[] input2 = {-7,-3,2,3,11};
        int[] expected1 = {0,1,9,16,100};
        int[] expected2 = {4,9,9,49,121};

        Solution s = new Solution();
        assertArrayEquals(expected1, s.sortedSquares(input1));
        assertArrayEquals(expected2, s.sortedSquares(input2));

    }
}

