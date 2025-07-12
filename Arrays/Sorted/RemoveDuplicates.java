package Arrays.Sorted;

public class RemoveDuplicates {

    static int removeDuplicates(int[] arr){
        if(arr.length == 0)
            return 0;
        int j = 0; // keeps track of duplicate element
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 4, 4};
        int length = removeDuplicates(arr);
        for(int i=0; i<length; i++)
            System.out.print(arr[i] + " ");
    }
}
