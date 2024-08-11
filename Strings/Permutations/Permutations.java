package Permutations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {

    // O(n * n!), O(n * n!)
    static void getPermutationsUsingRecursion(String prefix, String str, List<String> result){
        int n = str.length();
        if(n == 0)
            result.add(prefix);
        else {
            for(int i=0; i<n; i++)
                getPermutationsUsingRecursion(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1), result);
        }

    }

    // O(n * n!), O(n)
    static void getPermutationsUsingBacktracking(char[] chars, int index, List<String> result){
        if(index == chars.length)
            result.add(new String(chars));
        else {
            for(int i = index; i < chars.length; i++){
                swap(chars, index, i);
                getPermutationsUsingBacktracking(chars, index + 1, result);
                swap(chars, index, i);
            }
        }
    }

    static void swap(char[] chars, int i, int j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
    }

    // O(n * n!), O(n)
    static void getDistinctPermutationsUsingBacktracking(char[] chars, int index, List<String> result){
        if(index == chars.length)
            result.add(new String(chars));
        else {
            Set<Character> seen = new HashSet<>();
            for(int i=index; i<chars.length; i++){
                if(seen.add(chars[i])){
                    swap(chars, index, i);
                    getDistinctPermutationsUsingBacktracking(chars, index + 1, result);
                    swap(chars, index, i);
                }
            }
        }
    }

    // O(n * n!), O(n)
    static void getPermutationsUsingHeapAlgo(char[] chars, int n, List<String> result){
        if (n == 1)
            result.add(new String(chars));

        for (int i = 0; i < n; i++) {
            getPermutationsUsingHeapAlgo(chars, n - 1, result);
            if (n % 2 == 0) {
                swap(chars, i, n - 1);
            } else {
                swap(chars, 0, n - 1);
            }
        }
    }

    // O(n * n!), O(n)
    static void getPermutationUsingBooleanArr(String str, int depth, StringBuilder current, boolean[] used, List<String> result){
        if(depth == str.length())
            result.add(current.toString());
        for(int i = 0; i<str.length(); i++){
            if(!used[i]){
                used[i] = true;
                current.append(str.charAt(i));
                getPermutationUsingBooleanArr(str, depth + 1, current, used, result);
                current.deleteCharAt(current.length() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {

        // 1) Permutations Using Recursion
        String str = "ABC";
        List<String> result1 = new ArrayList<>();
        getPermutationsUsingRecursion("", str, result1);
        result1.forEach(System.out::println);

        // 2) Permutations Using BackTracking
        System.out.println();
        List<String> result2 = new ArrayList<>();
        getPermutationsUsingBacktracking(str.toCharArray(), 0, result2);
        result2.forEach(System.out::println);

        // 3) Distinct Permutations Using BackTracking 
        System.out.println();
        str = "AAB";
        List<String> result3 = new ArrayList<>();
        getDistinctPermutationsUsingBacktracking(str.toCharArray(), 0, result3);
        result3.forEach(System.out::println);

        // 4) Permutations Using Heap Algorithm
        System.out.println();
        str = "ABC";
        List<String> result4 = new ArrayList<>();
        getPermutationsUsingHeapAlgo(str.toCharArray(), str.length(), result4);
        result4.forEach(System.out::println);

        // 5) Permutations Using Boolean Array
        System.out.println();
        List<String> result5 = new ArrayList<>();
        getPermutationUsingBooleanArr(str, 0, new StringBuilder(), new boolean[str.length()], result5);
        result5.forEach(System.out::println);
    }
}
