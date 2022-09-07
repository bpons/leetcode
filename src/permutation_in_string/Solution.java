package permutation_in_string;

import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length())
            return false;
        int[] countsS1 = new int[26];
        int[] countsS2 = new int[26];
        char[] ca1 = s1.toCharArray();
        char[] ca2 = s2.toCharArray();
        for (char c: ca1
             ) {
            countsS1[c - 'a']++;
        }
        for (int i = 0; i < s1.length(); i++) {
            countsS2[ca2[i] - 'a']++;
        }
        if (Arrays.equals(countsS1, countsS2))
            return true;


        int cursor = s1.length();

        while (cursor <= s2.length() -1) {
            countsS2[ca2[cursor - s1.length()] - 'a']--;
            countsS2[ca2[cursor] - 'a']++;
            if (Arrays.equals(countsS1, countsS2))
                return true;
            cursor++;
        }
        return false;
    }
}
