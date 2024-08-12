public class CanFormPalindrome {

    // O(n), O(1)
    static boolean canFormPalindrome(String s){
        int[] count = new int[126];
        for(char c : s.toCharArray())
            count[c]++;
        int oddCount = 0;
        for(int i : count){
            if(i%2 != 0)
                oddCount++;
        }
        return oddCount <= 1;
    }
    public static void main(String[] args) {
        String str = "abab";
        System.out.println(canFormPalindrome(str));
        
        str = "ababc";
        System.out.println(canFormPalindrome(str));

        str = "ababcd";
        System.out.println(canFormPalindrome(str));
    }
}
