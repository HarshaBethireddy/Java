package Heaps;

import java.util.PriorityQueue;

public class KthLargest {
    // O(nlogk), O(k)
    static int kthLargestElem(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : arr){
            minHeap.add(num);
            if(minHeap.size() > k)
                minHeap.poll();
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        int[] arr = {3, 10, 2, 7, 5};
        int k = 3;
        System.out.println(kthLargestElem(arr, k));
    }
}
