package Arrays.TwoPointers;

public class SeperateEvenOdd {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
    static int[] seperateEvenOdd(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while(i < j){
            if(arr[i] % 2 == 0) // Stops at odd no
                i++;
            else if(arr[j] % 2 != 0) // Stops at even no
                j--;
            else {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 6, 2, 1};
        int[] res = seperateEvenOdd(arr);
        for(int num : res)
            System.out.print(num + " ");
    }
}
