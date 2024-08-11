package Remove;
public class RemoveNonAlphaNumeric {
    // O(n), O(n)
    static String removeNonAlphaNumericUsingStrBuilder(String s){
        StringBuilder cleaned = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c))
                cleaned.append(c);
        }
        return cleaned.toString();
    }

    // O(n), O(n)
    static String removeNonAlphaNumericUsingReplace(String s){
        return s.replaceAll("[^a-zA-Z0-9]", "");
    }
    public static void main(String[] args) {
        String s = "a1b2c3!@#";
        System.out.println(removeNonAlphaNumericUsingStrBuilder(s));
        System.out.println(removeNonAlphaNumericUsingReplace(s));
    }
}
