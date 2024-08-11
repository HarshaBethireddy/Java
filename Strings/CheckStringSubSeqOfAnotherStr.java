public class CheckStringSubSeqOfAnotherStr {

    // O(n + m), O(1)
    static boolean isSubsequence(String s1, String s2){
        int index1 = 0, index2 = 0;
        while(index1 < s1.length() && index2 < s2.length()){
            if(s1.charAt(index1) == s2.charAt(index2))
                index1++;
            index2++;
        }
        return index1 == s1.length();
    }
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ahbgdc";
        s1 = "abc";
        s2 = "aabsc";
        System.out.println(isSubsequence(s1, s2));
    }
}
