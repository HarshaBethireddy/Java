package Arrays;

public class Inverse {


    // Array value becomes index and its index becomes value
    static int[] inverse(int[] arr){
        int[] res = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int value = arr[i];
            res[value] = i;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 0, 4, 1};
        int[] res = inverse(arr);
        for(int num : res)
            System.out.print(num + " ");
    }
}
