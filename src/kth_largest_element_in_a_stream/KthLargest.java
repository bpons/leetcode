package kth_largest_element_in_a_stream;


import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;

class KthLargest {
    PriorityQueue<Integer> pQueue;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pQueue = new PriorityQueue<>(k);
        for (int n :
                nums) {
            add(n);
        }
    }

    public int add(int val) {
        pQueue.add(val);
        if (pQueue.size() > k)
            pQueue.poll();
        return pQueue.peek();
    }
}
