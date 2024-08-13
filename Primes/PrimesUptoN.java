package Primes;

import java.util.Arrays;

public class PrimesUptoN {

    // O(n^3/2), O(1)
    static void printPrimes(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i))
                System.out.print(i + " ");
        }
    }
    static boolean isPrime(int n){
        if(n <= 1)
            return false;
        if(n == 2 || n == 3)
            return true;
        if(n % 2 == 0 || n % 3 == 0)
            return false;
        for(int i=5; i<=Math.sqrt(n); i+=6){
            if(n % i == 0 || n % (i+2) == 0)
                return false;
        }
        return true;
    }

    // O(n * loglog(n)), O(n)
    static boolean[] sieveOferatosthenes(int n){
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(isPrime[i]){
                for(int j=i*i; j<=n; j+=i)
                    isPrime[j] = false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        int n = 18;
        printPrimes(n);
        System.out.println();
        boolean[] primes = sieveOferatosthenes(n);
        for(int i=2; i<=n; i++){
            if(primes[i])
                System.out.print(i + " ");
        }
    }
}
