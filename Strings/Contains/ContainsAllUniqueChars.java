package Contains;
public class ContainsAllUniqueChars {

    // O(n), O(1)
    static boolean containsAllUniqueChars(String s){
        boolean[] charSet = new boolean[256];
        for(char c : s.toCharArray()){
            if(charSet[c])
                return false;
            charSet[c] = true;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(containsAllUniqueChars(s));
    }
}
