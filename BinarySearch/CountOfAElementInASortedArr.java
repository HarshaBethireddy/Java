package BinarySearch;

// 2, 5, 10, 10, 10, 20, 20
// 0, 1, 2, 3, 4, 5, 6, 7 ....So if x = 10 then find the first Occurance = 2, last Occurance = 4 ----> count = last - first + 1 i.e, 4-2+1 = 3 
public class CountOfAElementInASortedArr {

    static int findOccurance(int[] arr, int x, boolean last) {
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
        int firstOccurance = findOccurance(arr, 20, false);
        int lastOccurance = -1;
        if (firstOccurance != -1)
            lastOccurance = findOccurance(arr, 20, true);
        int count = 0;
        count = lastOccurance - firstOccurance + 1;
        System.out.println(count);
    }
}
