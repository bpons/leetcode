package kth_largest_element_in_an_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        for (int n :
                nums) {
            add(n, priorityQueue, k);
        }
        return priorityQueue.peek();
    }

    private void add(int val, PriorityQueue priorityQueue, int k) {
        priorityQueue.add(val);
        if (priorityQueue.size() > k)
            priorityQueue.poll();
    }

}
