package BinarySearch;

public class BinarySearch {

    static int binarySearchForAscendingOrder(int[] arr, int x) {
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
        return -1;
    }

    static int binarySearchForDescendingOrder(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x)
                return mid;
            else if (x < arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] asc = { 1, 2, 3, 4, 5 };
        System.out.println(binarySearchForAscendingOrder(asc, 3));
        int[] desc = { 5, 4, 3, 2, 1 };
        System.out.println(binarySearchForDescendingOrder(desc, 2));
    }
}
