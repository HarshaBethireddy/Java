package Heaps;

import java.util.PriorityQueue;

public class KthSmallest {

    static int kthSmallestElem(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b-a);
        for(int num : arr){
            maxHeap.add(num);
            if(maxHeap.size() > k)
                maxHeap.poll();
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {3, 10, 2, 7, 5};
        int k = 3;
        System.out.println(kthSmallestElem(arr, k));
    }
}
