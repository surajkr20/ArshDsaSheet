package practise;

import java.util.ArrayList;
import java.util.List;

public class practise1 {
    public static void main(String[] args) {
        int arr[]  = {1,2,2,3,3,3,4,4,4,4};
        removeDuplicates(arr);

        List<Integer> result = removeDuplicates(arr);
        System.out.println(result);

        int ans = remove(arr);
        System.out.println(ans);
    }

    static List<Integer> removeDuplicates(int arr[]){
        List<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]){
                ans.add(arr[i+1]);
            }
        }
        return ans;
    }

    static int remove(int arr[]){
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=arr[j]){
                arr[++j] = arr[i];
            }else i++;
        }
        return ++j;
    }
}
