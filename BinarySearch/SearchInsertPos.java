package BinarySearch;

// If x is present return its position else return the position where it should be inserted
public class SearchInsertPos {
    static int searchInsertPosition(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x)
                return mid;
            else if (x < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int x = 2;
        System.out.println(searchInsertPosition(arr, x));
    }
}
