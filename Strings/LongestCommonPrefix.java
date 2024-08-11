public class LongestCommonPrefix {

    // O(n * m), O(1)
    static String longestCommonPrefix(String[] words){
        if(words.length == 0) return "";
        String prefix = words[0];
        for(int i=1; i<words.length; i++){
            while(words[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        
    }
}
