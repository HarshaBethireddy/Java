package TreeSet;

import java.util.TreeSet;

public class ArraySortRemovingDuplicates {
    static void sortArrayRemovingDuplicates(int[] arr){
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int num : arr)
            treeSet.add(num);
        for(int num : treeSet)
            System.out.print(num + " ");
    }
    public static void main(String[] args) {
        int[] arr = {8, 5, 1, 3, 2, 9, 2, 3};
        sortArrayRemovingDuplicates(arr);
    }
}
