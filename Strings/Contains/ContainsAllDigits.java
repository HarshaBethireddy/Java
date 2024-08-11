package Contains;
public class ContainsAllDigits {

    // O(n), O(1)
    static boolean containsAllDigitsUsingMatches(String s){
        return s.matches("\\d+");
    }

    // O(n), O(1)
    static boolean containsAllDigitsUsingForLoop(String s){
        for(char c : s.toCharArray()){
            if(!Character.isDigit(c))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "1104s";
        System.out.println(containsAllDigitsUsingMatches(s));
        System.out.println(containsAllDigitsUsingForLoop(s));
    }
}
