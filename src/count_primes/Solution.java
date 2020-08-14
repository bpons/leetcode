package count_primes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {

    public int countPrimes(int n) {
        boolean[] isNotPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isNotPrime[i])
                continue;
            count++;
            for (int j = i; j < n; j += i)
                isNotPrime[j] = true;
        }
        return count;
    }

}

//    private List<Integer> erathosteneSieve(int n) {
//        List<Integer> result = new ArrayList<>();
//        List<Integer> ints = IntStream.range(2, n)
//                .boxed().collect(Collectors.toList());
//        while (ints.size() > 0) {
//            int currN = ints.remove(0);
//            result.add(currN);
//            ints = ints.stream().filter(i -> i % currN != 0).collect(Collectors.toList());
//        }
//        return result;
//    }