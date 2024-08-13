package Primes;

public class SmallstPrimeFactor {

    static int smallestPrimeFactor(int n){
        if(n <= 1) return -1;
        if(n % 2 == 0) return 2;
        for(int i=3; i<=Math.sqrt(n); i+=2){
            if (n % i == 0) 
                return i;
        }
        return n;
    }
    public static void main(String[] args) {
        int n = 24;
        System.out.println(smallestPrimeFactor(n));
    }
}
