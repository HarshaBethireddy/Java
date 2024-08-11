package Reverse;
public class Reverse {

    // O(n), O(n) for StringBuilder
    static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
    
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(reverse(s));
    }
}
