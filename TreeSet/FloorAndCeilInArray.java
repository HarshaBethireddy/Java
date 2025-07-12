package TreeSet;

import java.util.TreeSet;

public class FloorAndCeilInArray {

    static int[] findFloorAndCeilInAnArray(int[] arr, int x){
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int num : arr)
            treeSet.add(num);

        int floorValue = treeSet.floor(x) == null ? -1 : treeSet.floor(x);
        int ceilValue = treeSet.ceiling(x) == null ? -1 : treeSet.ceiling(x);

        return new int[]{floorValue, ceilValue};
    }
    public static void main(String[] args) {
        int[] arr = {15, 10, 25, 20, 20};
        int[] res = findFloorAndCeilInAnArray(arr, 29);
        System.out.println("Floor is : " + res[0]);
        System.out.println("Ceil is : " + res[1]);
    }
}
