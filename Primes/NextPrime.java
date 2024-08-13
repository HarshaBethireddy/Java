package Primes;

public class NextPrime {

    static int nextPrime(int n){
        int candidate = n + 1;
        while(!isPrime(candidate))
            candidate++;
        return candidate;
    }

    static boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(int i=5; i<=Math.sqrt(n); i+=6){
            if(n % i == 0 || n % (i+2) == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(nextPrime(n));
    }
}
