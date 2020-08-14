package fibonacci_number;

import java.util.HashMap;
import java.util.Map;

class Solution {
    Map<Integer, Integer> memo = new HashMap<>();

//    public int fib(int N) {
//        int res;
//        if (memo.containsKey(N))
//            res = memo.get(N);
//        else if (N <= 1)
//            res = N;
//        else {
//           res =  fib(N - 1) + fib(N - 2);
//           memo.put(N, res);
//        }
//        return res;
//    }

    public int fib(int N) {
        int res = 0;
        for (int i = 0; i < N +1 ; i++) {
            if (i <= 1)
                res = i;
            else
                res = memo.get(i - 1) + memo.get(i - 2);
            memo.put(i, res);
        }
        return memo.get(N);
    }
}
