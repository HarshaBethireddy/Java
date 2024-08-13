package Primes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNosInARange {
    static List<Integer> getPrimeNumbersInRange(int start, int end){
        List<Integer> primes = new ArrayList<>();
        if(end < 2) return primes;
        boolean[] isPrime = sieveOfEratosthenes(end); 
        for(int i=Math.max(start, 2); i<=end; i++){
            if(isPrime[i])
                primes.add(i);
        }
        return primes;
    }

    static boolean[] sieveOfEratosthenes(int n){
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
        int start = 5;
        int end = 19;
        System.out.println(getPrimeNumbersInRange(start, end).toString());
    }
}
