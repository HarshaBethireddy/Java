package Primes;

//If only a num has its primes factors only as 2, 3, 5 only
public class UglyNumber {
    static boolean isUglyNumber(int n){
        while(n % 2 == 0) n /= 2;
        while(n % 3 == 0) n /= 3;
        while(n % 5 == 0) n /= 5;

        return n == 1;
    }
// given an integer n get the nth ugly number
    static int getNthUglyNumber(int n){
        if(n == 1) return 1;
        int count = 0, currentNum = 1;
        while(true){
            if(isUglyNumber(currentNum)){
                count++;
                if(count == n) return currentNum;
            }
            currentNum++;
        }
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(isUglyNumber(n));
        System.out.println(getNthUglyNumber(n));
    }
}
