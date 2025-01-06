package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// leetcode.ques.283. Move Zeroes => https://leetcode.com/problems/move-zeroes/description/

public class movezeros {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 3, 12 };
        System.out.println(Arrays.toString(arr));

        // List<Integer> ans = moveZeros(arr);
        // System.out.println(ans);

        // move(arr);
        // System.out.println("after moving : " + Arrays.toString(arr));

        moveZeros1(arr);
        System.out.println("after moving : " + Arrays.toString(arr));
    }

    // first approache
    static List<Integer> moveZeros(int nums[]) {
        int count = 0;
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                values.add(nums[i]);
            } else
                count++;
        }

        for (int i = 0; i < count; i++) {
            values.add(0);
        }

        return values;
    }

    // second approach
    static void move(int nums[]) {
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i + 1] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
    }

    // optimal approach
    static void moveZeros1(int nums[]) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
}
