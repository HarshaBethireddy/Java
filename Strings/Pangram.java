public class Pangram {
    static boolean isPangram(String s){
        boolean[] containsLetters = new boolean[26];

        for(char c : s.toCharArray()){
            containsLetters[c - 'a'] = true;
        }

        for(boolean b : containsLetters){
            if(!b)
                return false;
        }
        return true;     
    }
    public static void main(String[] args) {
        
    }
}
