// 26. Remove Duplicates from Sorted Array - https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class removeDuplicates {

    public static void main(String[] args) {
        int arr[]  = {1,2,2,3,3,3,4,4,4,4};
        // int result = removeDuplicate(arr);
        // System.out.println(result);

        List<Integer> ans = bruteForce(arr);
        System.out.println(ans);
    }

    // brute force approach but it's not valid for leetcode, because it's containg extra space
    static List<Integer> bruteForce(int arr[]){
        List<Integer> Ans = new ArrayList<>();

        if(arr.length == 0) return Ans; // for edge case - arr is empty

        Ans.add(arr[0]);

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]){
                Ans.add(arr[i+1]);
            }
        }
        return Ans;
    }

    // two pointers technique
    static int removeDuplicate(int arr[]){
        int n = arr.length;
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[j]!=arr[i]){
                arr[++j] = arr[i];
            }
        }
        return ++j;
    }
}