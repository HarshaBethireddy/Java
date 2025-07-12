package Maths.Gcd;

// O(n * log(max element)), O(1)
public class GcdOfArrayOfNums {

    static int gcd(int a, int b){
        while(a != 0 && b != 0){
            if(a > b)
                a = a % b;
            else 
                b = b % a;
        }
        return a != 0 ? a : b;
    }

    static int gcdArray(int[] arr){
        int res = arr[0];
        for(int i=1; i<arr.length; i++)
            res = gcd(res, arr[i]);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {24, 36, 48, 72};
        System.out.println(gcdArray(arr));
    }
}
