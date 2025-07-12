package TreeSet;

import java.util.TreeSet;

public class LowestAndHighestInArray {

    static int[] lowestAndHighestInArray(int[] arr){
        if(arr.length == 0) return new int[2];
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int num : arr)
            treeSet.add(num);
        return new int[] {treeSet.first(), treeSet.last()};
    }
    public static void main(String[] args) {
        int[] res = lowestAndHighestInArray(new int[] {});
        for(int num : res)
            System.out.print(num + " ");
    }
}
