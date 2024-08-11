package Vowels;

public class ReplaceAllVowelsWithDifferentChar {
    static String replaceAllVowelsWithDifferentChar(String s){
        String vowelsList = "aeiouAEIOU";
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if(vowelsList.indexOf(c) != -1){
                switch (c) {
                    case 'a','A'  -> res.append('!');
                    case 'e','E'  -> res.append('@');
                    case 'i','I'  -> res.append('#');
                    case 'o','O'  -> res.append('$');
                    case 'u','U'  -> res.append('%');
                }
            } else{
                res.append(c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "Harshu";
        System.out.println(replaceAllVowelsWithDifferentChar(s));
    }
}
