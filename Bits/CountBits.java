package Bits;

public class CountBits {
    static int[] countBits1(int n){
        int setbits = 0, unsetbits = 0;
        for(int i=31; i>=0; i--){
            if((n & (1 << i)) != 0)
                setbits++;
            else
                unsetbits++;
        }
        return new int[] {setbits, unsetbits};
    }

    static int[] countBits2(int n){
        int setbits = 0, unsetbits = 0;
        while(n > 0){
            if((n & 1) != 0)
                setbits++;
            else 
                unsetbits++;
            n = n >> 1;
        }
        return new int[] {setbits, unsetbits};
    }
    public static void main(String[] args) {
        int n = 7;
        int[] res1 = countBits1(n);
        int[] res2 = countBits2(n);
        System.out.println(res1[0] + " " +res1[1] + " : " + res2[0] + " " + res2[1]);
    }
}
