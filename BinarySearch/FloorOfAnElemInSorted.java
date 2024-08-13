package BinarySearch;

public class FloorOfAnElemInSorted {
    static int floorOfAnElementInSortedArr(int[] arr, int x){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == x)
                return arr[mid];
            else if(x < arr[mid])
                end = mid - 1;
            else {
                ans = arr[mid];
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10, 10};
        System.out.println(floorOfAnElementInSortedArr(arr, 0));
    }
}
