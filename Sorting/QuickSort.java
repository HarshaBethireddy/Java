public class QuickSort {
    static void quickSort(int arr[], int low, int high){
        int pivot, i, j, temp;
        if(low < high){
            pivot = low;
            i = low;
            j = high;

            while(i < j){
                while(arr[i] <= arr[pivot] && i<high)
                    i++;
                while(arr[j] > arr[pivot] && j>=low)
                    j--;
                if(i < j){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            temp = arr[j];
            arr[j] = arr[pivot];
            arr[pivot] = temp;
            quickSort(arr, low, j-1);
            quickSort(arr, j+1, high);
        }    
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 5, 2, 7};
        System.out.print("Before Sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        quickSort(arr, 0, arr.length-1);
        System.out.print("After Sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
