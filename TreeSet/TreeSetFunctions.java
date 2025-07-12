package TreeSet;

import java.util.TreeSet;

public class TreeSetFunctions {
    public static void main(String[] args) {
        int[] arr = {7, 2, 2, 4, 5, 33, 8, 2, 6, 8, 5, 1, 9, 7};

        TreeSet<Integer> treeSet = new TreeSet<>();
        //Adding into treeset
        for(int num : arr)
            treeSet.add(num);
        //Reverse from treeset
        System.out.println(treeSet.reversed()); //Not inplace
        System.out.println(treeSet.descendingSet());
        //Removing an element from treeset
        treeSet.remove(2);
        System.out.println(treeSet);
        //Finding min element
        System.out.println(treeSet.first());
        System.out.println(treeSet.getFirst());
        //Finding max element
        System.out.println(treeSet.last());
        System.out.println(treeSet.getLast());
        //Searching element
        System.out.println(treeSet.contains(2));
        //Checking
        System.out.println(treeSet.isEmpty());

    }
}
