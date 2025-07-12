package Arrays;

// O(n), O(1)
public class MaxElement {
    static int maxElement1(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    static int maxElement2(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {5, 88, 1, 4, 2};
        System.out.println(maxElement1(arr));
        System.out.println(maxElement2(arr));
    }
}
