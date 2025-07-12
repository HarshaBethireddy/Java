package Arrays;

public class Rotate {

    // O(n), O(1)
    static void rotateOnce(int[] arr){
        int temp = arr[0];
        for(int i=1; i<arr.length; i++)
            arr[i-1] = arr[i];
        arr[arr.length-1] = temp;
    }

    // O(k * n)
    static void rotateUsingRotateOnce(int[] arr, int k){
        if(k < 0)
            k = k + arr.length;
        else
            k = k % arr.length;
        for(int i=1; i<=k; i++)
            rotateOnce(arr);
    }

    static void rotateUsingReverse(int[] arr, int k){
        if(k < 0)
            k = k + arr.length;
        else
            k = k % arr.length;
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0 , arr.length-1);
    }

    static void reverse(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateUsingRotateOnce(arr, 5);
        for(int num : arr)
            System.out.print(num + " ");
        System.out.println();
        int[] a = {5, 6, 7, 8, 9};
        rotateUsingReverse(a, 6);
        for(int num : a)
            System.out.print(num + " ");
    }
}
