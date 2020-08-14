package reverse_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseString() {
        Solution sol = new Solution();
        char [] input = {'h','e','l','l','o'};
        char [] expectedResult = {'o','l','l','e','h'};
        sol.reverseString(input);
        assertArrayEquals(expectedResult, input );
    }
}