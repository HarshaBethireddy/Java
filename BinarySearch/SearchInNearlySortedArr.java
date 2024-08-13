package BinarySearch;

public class SearchInNearlySortedArr {

    static int searchInNearlySortedArr(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int prev = Math.max(0, mid-1);
            // int prev = (mid-1+arr.length)%arr.length;
            // int next = (mid+1)%arr.length;
            int next = Math.min(mid+1, arr.length-1);
            if (arr[mid] == x)
                return mid;
            else if (prev == x)
                return mid - 1;
            else if (next == x)
                return mid + 1;
            else if (x < prev)
                end = mid - 2;
            else
                start = mid + 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 10 };
        int x = 12;
        System.out.println(searchInNearlySortedArr(arr, x));
    }
}
