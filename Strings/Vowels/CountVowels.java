package Vowels;
public class CountVowels{
    static int countVowels(String s){
        String vowelsList = "aeiouAEIOU";
        int count = 0;
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                if(vowelsList.indexOf(c) != -1)
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Harsha";
        System.out.println(countVowels(s));
    }
}