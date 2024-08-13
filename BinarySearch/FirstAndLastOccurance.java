package BinarySearch;

public class FirstAndLastOccurance {

    static int findFirstOrLastOccurance(int[] arr, int x, boolean last) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                ans = mid;
                if (!last)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else if (x < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 10, 10, 10, 20, 20 };
        System.out.println(findFirstOrLastOccurance(arr, 10, false));
        System.out.println(findFirstOrLastOccurance(arr, 10, true));
    }
}
