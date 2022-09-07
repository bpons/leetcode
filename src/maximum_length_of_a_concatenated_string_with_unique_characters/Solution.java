package maximum_length_of_a_concatenated_string_with_unique_characters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int maxLength(List<String> arr) {

        int i = 0;
        while (!hasNoDuplicate(arr.get(i)) && i < arr.size()-1)
            i++;
        if (i == arr.size()-1 && !hasNoDuplicate(arr.get(i)))
            return 0;

        String longestResult = "";

        while (i < arr.size()) {
            String s1 = arr.get(i);
            if (!hasNoDuplicate(s1))
                continue;
            String result = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                String s2 = arr.get(j);
                if (!hasNoDuplicate(s2))
                    continue;
                String s3 = s1 + s2;
                String s4 = result + s2;
                if (hasNoDuplicate(s3)) {
                    if (hasNoDuplicate(s4))
                        result = s3.length() >= s4.length() ? s3 : s4;
                    else
                        result = s3.length() >= result.length() ? s3 : result;
                } else{
                    if (hasNoDuplicate(s4))
                        result = s4;

                }
            }
            if (result.length() > longestResult.length())
                longestResult = result;
            i++;
        }
        System.out.println(longestResult);
        return longestResult.length();
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