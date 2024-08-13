package BinarySearch;

public class SearchInRotatedSortedArray {

    static int binarySearch(int[] arr, int start, int end, int x) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x)
                return mid;
            else if (x < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    static int findMinElemIndex(int[] arr) {
        if (arr.length == 0)
            return -1;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end])
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int x = 0;

        int index = findMinElemIndex(arr);

        int a = binarySearch(arr, 0, index - 1, x);
        int b = binarySearch(arr, index, arr.length - 1, x);

        if (a == -1)
            System.out.println(b);
        else
            System.out.println(a);
    }
}