package HashTables.Arrays;

import java.util.HashSet;

// Time Complexity: O(n)
// Space Complexity: O(n)
public class FindDuplicates {
    static boolean hasDuplicates(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(!set.add(num))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasDuplicates(new int[]{1, 2, 3, 4, 5, 6, 2}));  // Output: true
    }
}
