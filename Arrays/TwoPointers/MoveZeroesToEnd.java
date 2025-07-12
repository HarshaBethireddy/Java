package Arrays.TwoPointers;

public class MoveZeroesToEnd {
    static void moveZeroesToend(int[] arr){
        if(arr.length <= 1)
            return;
        int nz = 0, z = 0;
        while(nz < arr.length){
            if(arr[nz] != 0){
                // swap(arr, nz, z)
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 0, 9, 17};
        moveZeroesToend(arr);
        for(int num : arr)
            System.out.print(num + " ");
    }
}
