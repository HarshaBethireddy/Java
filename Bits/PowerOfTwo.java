package Bits;

public class PowerOfTwo {

    static boolean isPowerOf2(int n) {
        return (n > 0) && ((n &(n - 1)) == 0);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(isPowerOf2(n));
    }
}
