public class MergeSort {

    static void mergeSort(int[] arr, int low, int high){
        if(low >= high) return;
        int mid = low + (high-low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high){
        int[] merged = new int[high-low+1];
        int i = low, j = mid+1, k = 0;
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j])
                merged[k++] = arr[i++];
            else
                merged[k++] = arr[j++];
        }

        while(i <= mid)
            merged[k++] = arr[i++];
        while(j <= high)
            merged[k++] = arr[j++];
        for(int ele=0 , s = low; ele < merged.length; ele++, s++)
            arr[s] = merged[ele];
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 5, 2, 7};
        System.out.print("Before Sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        mergeSort(arr, 0, arr.length-1);
        System.out.print("After Sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
