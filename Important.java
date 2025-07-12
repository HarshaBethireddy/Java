import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Important {

    static int[] listToArrayUsingStreams(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    static List<Integer> ArrayToListUsingStreams(int[] arr) {
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    static int[] listToArray(List<Integer> list) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);
        return arr;
    }

    static List<Integer> ArrayToList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr)
            list.add(num);
        return list;
    }

    static List<Map.Entry<Character, Integer>> sortBasedOnFrequency(String s, boolean desc) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray())
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

        if (!desc) {
            return freqMap.entrySet()
                    .stream()
                    .sorted((entry1, entry2) -> {
                        int valueComparison = entry1.getValue().compareTo(entry2.getValue());
                        return valueComparison != 0 ? valueComparison : entry1.getKey().compareTo(entry2.getKey());
                    })
                    .collect(Collectors.toList());
        } else {
            return freqMap.entrySet()
                    .stream()
                    .sorted((entry1, entry2) -> {
                        int valueComparison = entry2.getValue().compareTo(entry1.getValue());
                        return valueComparison != 0 ? valueComparison : entry2.getKey().compareTo(entry1.getKey());
                    })
                    .collect(Collectors.toList());
        }
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("List To Array");
        for(int num : listToArray(list))
            System.out.print(num + " ");
        System.out.println();
        System.out.println("List To Array Using Streams");
        for(int num : listToArrayUsingStreams(list))
            System.out.print(num + " ");

        System.out.println();

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Array To List");
        for(int num : ArrayToList(arr))
            System.out.print(num + " ");
        System.out.println();
        System.out.println("Array To List Using Streams");
        for(int num : ArrayToListUsingStreams(arr))
            System.out.print(num + " ");
        
        System.out.println();

        String s = "deeqaasa";
        System.out.println("Sorting using Frequencies");
        List<Map.Entry<Character, Integer>> sortedList = sortBasedOnFrequency(s, false);
        sortedList.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

        System.out.println("To get top value");
        Map.Entry<Character, Integer> topEntry = sortedList.get(0);
        System.out.println(topEntry.getKey() + " : " + topEntry.getValue());

        System.out.println("To get bottom value");
        Map.Entry<Character, Integer> bottomEntry = sortedList.get(sortedList.size()-1);
        System.out.println(bottomEntry.getKey() + " : " + bottomEntry.getValue());
    }
}
