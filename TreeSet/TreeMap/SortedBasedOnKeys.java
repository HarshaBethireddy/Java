//package TreeSet.TreeMap;

import java.util.TreeMap;

public class SortedBasedOnKeys {

    static void sortBasedOnKeys(String s){
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        for(char c : s.toCharArray())
            treeMap.put(c, treeMap.getOrDefault(c, 0) + 1);
        treeMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
    public static void main(String[] args) {
        String s = "harsha";
        sortBasedOnKeys(s);
    }
}
