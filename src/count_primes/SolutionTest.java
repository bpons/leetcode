package count_primes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countPrimes() {
        Solution s = new Solution();
        assertEquals(4, s.countPrimes(10));
        assertEquals(0, s.countPrimes(2));
        assertEquals(1, s.countPrimes(3));
        assertEquals(41537, s.countPrimes(
                499979));
    }
}