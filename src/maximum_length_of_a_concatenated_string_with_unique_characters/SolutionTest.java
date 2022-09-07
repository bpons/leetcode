package maximum_length_of_a_concatenated_string_with_unique_characters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testMaxLength() {
        String[] input = {"abc","def","bp","dq","eg","fh"};
        Solution s = new Solution();
        assertEquals(9, s.maxLength(Arrays.asList(input)));
    }
}