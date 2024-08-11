import java.util.Arrays;

public class Anagrams {

    // O(n), O(1)
    static boolean isAnagramUsingCountArr(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        
            int[] count = new int[128];
            for(int i=0; i<s1.length(); i++){
                count[s1.charAt(i)]++;
                count[s2.charAt(i)]--;
            }

            for(int i : count){
                if(i != 0)
                    return false;
            }
        return true;
    }

    // O(nlogn),O(n)
    static boolean isAnagramUsingSorting(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        char[] charArr1 = s1.toCharArray();
        char[] charArr2 = s2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        return Arrays.equals(charArr1, charArr2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagramUsingCountArr(str1, str2));
        System.out.println(isAnagramUsingSorting(str1, str2));
    }
}
