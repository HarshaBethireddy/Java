public class SelectionSort {

    static void selectionSort(int[] arr){
        int n = arr.length, min_index = 0;

        for(int i=0; i<n-1; i++){
            min_index = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min_index])
                    min_index = j;
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 5, 2, 7};
        System.out.print("Before Sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        selectionSort(arr);
        System.out.print("After Sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
