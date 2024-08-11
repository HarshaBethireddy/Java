package Vowels;
public class RemoveAllVowels {

    // O(n), O(n)
    static String removeAllVowelsUsingReplace(String s){
        return s.replaceAll("[AEIOUaeiou]", "");
    }

    static String removeAllVowelsUsingFor(String s){
        String vowelsList = "aeiouAEIOU";
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if(vowelsList.indexOf(c) == -1)
                res.append(c);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str = "Harsha";
        System.out.println(removeAllVowelsUsingReplace(str));
        System.out.println(removeAllVowelsUsingFor(str));
    }
}
