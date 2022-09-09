package maximum_length_of_a_concatenated_string_with_unique_characters;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

class Solution2 {
    public int maxLength(List<String> arr) {

        int i = 0;
        while (!hasNoDuplicate(arr.get(i)) && i < arr.size()-1)
            i++;
        if (i == arr.size()-1 && !hasNoDuplicate(arr.get(i)))
            return 0;

        List<String> concats = new ArrayList<>();
        concats.add(arr.get(i));
        int result = arr.get(i).length();
        i++;
        while (i < arr.size()) {
            String nextS = arr.get(i);
            for (int j = 0; j < concats.size(); j++) {
                String concat = concats.get(j) + nextS;
                if (hasNoDuplicate(concat)) {
                    concats.add(concat);
                    result = Math.max(concat.length(), result);
                }
            };
            if (hasNoDuplicate(nextS)) {
                concats.add(nextS);
                result = Math.max(nextS.length(), result);
            }
            i++;
        }
        return result;
    }


    private boolean hasNoDuplicate(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i=0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i+1])
                return false;
        }
        return true;
    }
}