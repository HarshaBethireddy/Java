package Bits;

//if n = 4, then 1^2^3^4
public class XorFrom1ToN {

    static int getXorValue(int num){
        int n = num % 4;
        if(n == 0) return num;
        else if(n == 1) return 1;
        else if(n == 2) return num + 1;
        else return 0;
    }
    public static void main(String[] args) {
        int num = 7;
        System.out.println(getXorValue(num));
    }
}
