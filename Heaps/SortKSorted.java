package Heaps;

import java.util.PriorityQueue;

// 6, 5, 3, 2, 8, 10, 9 ---> Sorting(O(log n))
// But to use K sorted Arr
// Consider 6 and the k value suppose (k = 3) so the elements we need to check are only 6, 5, 3, 2 ---> We get min as 2
// Consider 5, so the elements we need to check are only 5, 3, 2, 8 ----> we get min as 3
// Can use minHeap
public class SortKSorted {
    static int[] sortNearlySorted(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int index = 0;
        int[] res = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            minHeap.add(arr[i]);
            if(minHeap.size() > k)
                res[index++] = minHeap.poll();
        }
        while(!minHeap.isEmpty()){
            res[index++] = minHeap.poll();
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        int[] res = sortNearlySorted(arr, k);
        for(int num : res)
            System.out.print(num + " ");
    }
}
