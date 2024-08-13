package Primes;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsOfANum {

    static List<Integer> primeFactors(int n){
        List<Integer> factors = new ArrayList<>();
        while(n % 2 == 0){
            factors.add(2);
            n /= 2;
        }
        for(int i=3; i*i<=n; i+=2){
            while(n % i == 0){
                factors.add(i);
                n /= i;
            }
        }
        if(n > 2)
            factors.add(n);

        return factors;
    }
    public static void main(String[] args) {
        int n = 24;
        System.out.println(primeFactors(n).toString());
    }
}
