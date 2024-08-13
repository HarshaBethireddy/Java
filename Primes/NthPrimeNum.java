package Primes;

public class NthPrimeNum {

    static int findNthPrime(int n){
        if(n <= 0) return -1;
        int count = 0, num = 1;
        while(count < n){
            num++;
            if(isPrime(num))
                count++;
        }
        return num;
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
        int n = 7;
        System.out.println(findNthPrime(n));
    }
}
