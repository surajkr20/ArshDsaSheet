package practise;

import java.util.Arrays;

public class practise {
    public static void main(String[] args) {
        int arr[] = { 2, 6, 1, 34, 9, 12 };
        int target = 34;

        int ans = search(arr, target);
        System.out.println(ans);

        int search = search(arr, target);
        System.out.println(search);

        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // linear search
    static int search(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // using binary search
    static int binarySearch(int arr[], int target) {
        int low = 0;
        int hi = arr.length - 1;
        while (low <= hi) {
            int mid = low + (hi - low) / 2;
            if (target > arr[mid]) {
                low = mid + 1;
            } else if (target < arr[mid])
                hi = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    // bubble sort
    static void bubblesort(int arr[]) {
        for (int j = 0; j < arr.length; j++) {
            boolean isSwaped = false;
            for (int i = 0; i < arr.length - i- 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSwaped = true;
                }
            }
            if(!isSwaped) break;
        }
    }
}
