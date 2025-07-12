package HashTables.Arrays;

import java.util.ArrayList;
import java.util.HashSet;

// Time Complexity: O(n + m)
// Space Complexity: O(min(n, m))
public class ArrayIntersection {
    static int[] intersection(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1)
            set.add(num);
        ArrayList<Integer> intersection = new ArrayList<>();
        for(int num : arr2){
            if(set.contains(num)){
                intersection.add(num);
                set.remove(num);
            }
        }
        return intersection.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        int[] result = intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        for (int num : result) {
            System.out.print(num + " ");  // Output: 2
        }
    }
}
