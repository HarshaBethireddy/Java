package Heaps;

import java.util.PriorityQueue;

public class KLargestElems {

    static int[] kLargestElements(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : arr){
            minHeap.add(num);
            if(minHeap.size() > k)
                minHeap.poll();
        }
        int[] result = new int[k];
        for(int i=0; i<k; i++)
            result[i] = minHeap.poll();
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {3, 10, 2, 7, 5};
        int k = 3;
        int[] res = kLargestElements(arr, k);
        for(int num : res)
            System.out.print(num + " ");
    }
}
