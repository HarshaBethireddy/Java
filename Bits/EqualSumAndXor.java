package Bits;


// (n + i) = (n ^ i) -----> count --> 2^unset_bits
public class EqualSumAndXor {

    static int findEqualSumAndXor(int n){
        int unsetCount = 0;
        while(n > 0){
            if((n & 1) == 0)
                unsetCount++;
            n = n >> 1;
        }
        return 1 << unsetCount;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(findEqualSumAndXor(n));
    }
}
