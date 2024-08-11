package Contains;
import java.util.ArrayList;
import java.util.List;

public class FindAllOccurances {

    static List<Integer> findAllOccurances(String s, String pattern){
        List<Integer> indices = new ArrayList<>();
        int index = s.indexOf(pattern);
        while(index >= 0){
            indices.add(index);
            index = s.indexOf(pattern, index + 1);
        }
        return indices;
    }
    public static void main(String[] args) {
        String str = "abaabcab";
        String pattern = "ab";
        System.out.println(findAllOccurances(str, pattern));
    }
}
