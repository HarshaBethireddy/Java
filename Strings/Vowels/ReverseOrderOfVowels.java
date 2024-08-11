package Vowels;

public class ReverseOrderOfVowels {

    static String reverseOrderOfVowels(String s){
        String vowelsList = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int n = s.length();
        int i = 0;
        int j = n-1;

        while(i < j){
            while(i < n && vowelsList.indexOf(chars[i]) == -1)
                i++;
            while(j >= 0 && vowelsList.indexOf(chars[j]) == -1)
                j--;
            if (i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String s = "Krishna";
        System.out.println(reverseOrderOfVowels(s));
    }
}
