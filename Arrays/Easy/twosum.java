package Arrays.Easy;

import java.util.Arrays;

// Leetcode.Ques.1 => two sum => https://leetcode.com/problems/two-sum/description/
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.You can return the answer in any order.

public class twosum {
    public static void main(String[] args) {
        int arr[] = {2,3,11,15};
        int target = 14;

        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    // brute force solution
    static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // second approach using hashmap(but, now i'm not learing this consept, so i skiped this)

}
