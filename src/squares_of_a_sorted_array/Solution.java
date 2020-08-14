package squares_of_a_sorted_array;

import java.util.Arrays;

//TODO: two pointers
//TODO: review quicksort
class Solution {
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        for (int i = 0; i < A.length ; i++) {
            result[i] = A[i]*A[i];
        }
        Arrays.sort(result);

        return result;
    }
}