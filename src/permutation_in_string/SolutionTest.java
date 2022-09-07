package permutation_in_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void checkInclusion() {
        String s1 = "ab", s2 = "eidbaooo";

        Solution s = new Solution();
        assertTrue(s.checkInclusion(s1, s2));
        s2 = "eidboaoo";
        assertFalse(s.checkInclusion(s1, s2));
        s2 = "a";
        assertFalse(s.checkInclusion(s1, s2));
    }
}