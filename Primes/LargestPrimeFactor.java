package Primes;

public class LargestPrimeFactor {

    static int largestPrimeFactor(int n){
        int largest = -1;
        while(n % 2 == 0){
            largest = 2;
            n /= 2;
        }
        for(int i=3;i*i<=n; i+=2){
            while(n % i == 0){
                largest = i;
                n /= i;
            }
        }
        if(n > 2)
            largest = n;
        
        return largest;
    }
    public static void main(String[] args) {
        int n = 24;
        System.out.println(largestPrimeFactor(n));
    }
}
