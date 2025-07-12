//package Arrays.SubArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintAllSubArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2 };
        List<List<Integer>> subarrays = printAllSubArr(arr);
        // subarrays.forEach(subarray -> System.out.println(subarray));
        subarrays.forEach(System.out::println);
    }

    private static List<List<Integer>> printAllSubArr(int[] arr) {
        // List<List<Integer>> subarrays = new ArrayList<>();
        Set<List<Integer>> subarrays = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> subarray = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                subarray.add(arr[j]);
                // if(subarray.size() == 1)
                subarrays.add(new ArrayList<>(subarray));
            }
        }
        // return subarrays;
        return new ArrayList<>(subarrays);
    }
}
