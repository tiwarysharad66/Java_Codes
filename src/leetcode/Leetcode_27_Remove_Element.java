package leetcode;
import java.util.Arrays;
import java.util.List;

public class Leetcode_27_Remove_Element {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int x = remove(arr, 3);

        System.out.println(x);
    }
    public static int remove(int[]nums,int k){
       int counter= 0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]!=k){
               nums[counter] = nums[i];
               counter++;
           }
       }
       return counter;


    }
}
