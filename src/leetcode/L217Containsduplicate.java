package leetcode;

import java.util.Arrays;

public class L217Containsduplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
boolean b = dup(arr);
        System.out.println(b);

    }
    public static boolean dup(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
       for(int i=1;i<n;i++){
           if(nums[i]==nums[i-1]){
               return true;
           }
       }
       return false;
    }
}
