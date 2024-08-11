public class InsertionSort {

    static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i=1; i<n; i++){
            int j = i;
            while(j >= 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
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
        insertionSort(arr);
        System.out.print("After Sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
