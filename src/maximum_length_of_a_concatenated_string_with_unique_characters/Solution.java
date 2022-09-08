package maximum_length_of_a_concatenated_string_with_unique_characters;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

class Solution {
    public int maxLength(List<String> arr) {

        int i = 0;
        while (!hasNoDuplicate(arr.get(i)) && i < arr.size()-1)
            i++;
        if (i == arr.size()-1 && !hasNoDuplicate(arr.get(i)))
            return 0;

        Set<String> concats = new ConcurrentSkipListSet<>();
        //TODO: Does not work???
//        Set<String> concats = new ConcurrentSkipListSet<>(Comparator.comparing(String::length).reversed());
        concats.add(arr.get(i));
        i++;
        while (i < arr.size()) {
            String nextS = arr.get(i);
            concats.forEach(s -> {
                String concat = s + nextS;
                if (hasNoDuplicate(concat))
                    concats.add(concat);
            });
            if (hasNoDuplicate(nextS))
                concats.add(nextS);
            i++;
        }
        System.out.println(concats);
        List<String> sortedConcats = new ArrayList<>(concats);
        Collections.sort(sortedConcats, Comparator.comparing(String::length).reversed());
        return sortedConcats.get(0).length();
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