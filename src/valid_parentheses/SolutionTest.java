package valid_parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isValid() {
        Solution s = new Solution();
        String in = "()";
        assertTrue(s.isValid(in));
    }
}