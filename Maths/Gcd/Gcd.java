package Maths.Gcd;

public class Gcd {

    // O(log(min(a, b))), O(1)
    static int gcd(int a, int b){
        while(a != 0 && b != 0){
            if(a > b)
                a = a % b;
            else
                b = b % a;
        }
        return a != 0 ? a : b;
    }
    public static void main(String[] args) {
        System.out.println(gcd(5, 15));
    }
}
