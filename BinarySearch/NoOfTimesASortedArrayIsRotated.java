package BinarySearch;

public class NoOfTimesASortedArrayIsRotated {
    static int noOfTimesASortedArrayIsRotated(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // if first or last element us mid simply use modulo so that it never gets out
            // of bound
            int prev = (mid - 1 + arr.length) % arr.length;
            int next = (mid + 1) % arr.length;

            if (arr[mid] <= arr[prev] && arr[mid] <= arr[next])
                return mid;
            else if (arr[mid] >= arr[start])
                start = mid + 1;
            else
                end = mid - 1; // arr[mid] <= arr[end]
        }
        return -1;
    }

    static int noOfTimesASortedArrayIsRotated1(int[] arr) {
        if (arr.length == 1)
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
        int arr[] = { 15, 18, 2, 3, 6, 12 };
        System.out.println(noOfTimesASortedArrayIsRotated(arr));
        System.out.println(noOfTimesASortedArrayIsRotated1(arr));
    }
}
