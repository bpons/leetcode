package maximum_length_of_a_concatenated_string_with_unique_characters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testMaxLength() {
//        String[] input = {"abc","def","bp","dq","eg","fh","gxyz"};
        String[] input = {"ab","cd","cde","cdef","efg","fgh","abxyz"};
        Solution s = new Solution();
        assertEquals(11, s.maxLength(Arrays.asList(input)));
    }
}

