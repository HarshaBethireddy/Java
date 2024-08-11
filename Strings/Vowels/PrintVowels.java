package Vowels;

public class PrintVowels {
    static String printVowels(String s){
        String vowelsList = "aeiouAEIOU";
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if(vowelsList.indexOf(c) != -1)
                res.append(c);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "Harsha";
        System.out.println(printVowels(s));
    }
}
