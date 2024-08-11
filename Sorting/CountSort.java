
public class CountSort {
    static void countSort(int arr[]){
        int idx1=0, idx2=0;
        int max = arr[0];
        for(int i=1; i<arr.length; i++)
            max = Math.max(max, arr[i]);
        int[] count = new int[max+1];
        for(int i=0; i < arr.length; i++){
            count[arr[i]]++;
        }
        while(idx1 <= max){
            if(count[idx1] > 0){
                arr[idx2] = idx1;
                count[idx1]--;
                idx2++;
            } else {
                idx1++;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 5, 2, 7};
        System.out.print("Before Sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        countSort(arr);
        System.out.print("After Sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
