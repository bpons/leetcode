package first_bad_version;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void firstBadVersion() {
        Solution s = new Solution();
        assertEquals(4, s.firstBadVersion(5));
    }
}