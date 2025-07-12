//package Arrays.SubArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AllSubArrWihSumK {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 9, 11};
        int k = 5;
        allSubArrWithSumK(arr, k);
        allSubArrWithSumKUsingHashing(arr, k);
    }

    // Bruteforce
    private static void allSubArrWithSumK(int[] arr, int k) {
        Set<List<Integer>> subarrays = new LinkedHashSet<>();
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            List<Integer> subarray = new ArrayList<>();
            for(int j=i;j<arr.length; j++){
                sum += arr[j];
                subarray.add(arr[j]);
                if(sum == k)
                subarrays.add(new ArrayList<>(subarray));
            }
        }
        System.out.println(subarrays.toString());
    }

    private static void allSubArrWithSumKUsingHashing(int[] arr, int k){
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, -1);
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(prefixSumMap.containsKey(sum - k)){
                int startIndex = prefixSumMap.get(sum - k) + 1;
                int endIndex = i;
                System.out.println("Subarray found from index " + startIndex + " to " + endIndex);
            }
            prefixSumMap.put(sum, i);
        }
    }
}
