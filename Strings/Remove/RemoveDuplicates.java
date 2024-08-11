package Remove;
import java.util.Set;
import java.util.HashSet;

public class RemoveDuplicates {
    // O(n), O(1)
    static String removeDuplicates(String s){
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()){
            if(seen.add(c))
                result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "abbaacb";
        System.out.println(removeDuplicates(s));
    }
}
