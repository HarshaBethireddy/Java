package Vowels;

public class ReplaceAllVowelsWithAnotherChar {

    static String replaceAllVowelsWithAnotherCharUsingReplace(String s, char newCharacter){
        return s.replaceAll("[AEIOUaeiou]", String.valueOf(newCharacter));
    }

    static String replaceAllVowelsWithAnotherChar(String s, char newCharacter){
        String vowelsList = "aeiouAEIOU";
        StringBuilder res = new StringBuilder(s);
        for(int i=0; i<s.length(); i++){
            if(vowelsList.indexOf(s.charAt(i)) != -1)
                res.setCharAt(i, newCharacter);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "Harsha";
        System.out.println(replaceAllVowelsWithAnotherCharUsingReplace(s, '@'));
        System.out.println(replaceAllVowelsWithAnotherChar(s, '!'));
    }
}
