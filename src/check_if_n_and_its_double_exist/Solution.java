package check_if_n_and_its_double_exist;

import java.util.*;

class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> validValues = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (validValues.contains(arr[i]))
                return true;
            if (arr[i] % 2 == 0)
                validValues.add(arr[i] / 2);
            validValues.add(arr[i] * 2);
        }
        return false;
    }
}
