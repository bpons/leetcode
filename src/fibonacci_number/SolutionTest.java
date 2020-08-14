package fibonacci_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void fib() {
        Solution s = new Solution();
        assertEquals(13, s.fib(7));
        assertEquals(987, s.fib(16));
    }
}