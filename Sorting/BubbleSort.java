public class BubbleSort {

    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
        bubbleSort(arr);
        System.out.print("After Sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}